package by.epam.task1.reader;

import by.epam.task1.validation.FileValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;


public class FileReader {

    private final static  Logger LOGGER = LogManager.getLogger();

    public List<String> readFile(String path) {
        File file = new File(path);
        FileValidator fileValidator = new FileValidator();
        boolean resultValidation;
        resultValidation = fileValidator.checkFile(file);
        if (!resultValidation) {
            LOGGER.log(Level.FATAL, "FATAL ERROR file is incorrect!");
            throw new RuntimeException("FATAL ERROR: file not found or empty or null" + path);
        }
        try {
            return Files.readAllLines(file.toPath());
        } catch (IOException e) {
            LOGGER.log(Level.ERROR, "IO Error", e);
        }
        return null;
    }
}