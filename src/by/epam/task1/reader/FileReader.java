package by.epam.task1.reader;

import by.epam.task1.main.Main;
import by.epam.task1.validation.FileValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;


public class FileReader {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public List<String> readFile(String path) {
        File file = new File(path);
        FileValidator fileValidator = new FileValidator();
        boolean resultValidation;
        resultValidation = fileValidator.checkFile(file);
        if (!resultValidation) {
            throw new RuntimeException("ERROR: file not found or empty or null" + path);
        }
        try {
            return Files.readAllLines(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
