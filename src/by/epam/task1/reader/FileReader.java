package by.epam.task1.reader;

import by.epam.task1.exeption.FileIsNotReadExeption;
import by.epam.task1.validation.FileValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class FileReader {

    private final static  Logger LOGGER = LogManager.getLogger();

    public static String readFile(String pathToFile) {
        File file = new File(pathToFile);
        StringBuilder result = new StringBuilder();
        FileValidator fileValidator = new FileValidator();

        boolean isExist;
        isExist = fileValidator.checkExist(file);
        if (!isExist) {
            LOGGER.log(Level.FATAL, "FATAL ERROR: file is incorrect!");
            throw new RuntimeException("FATAL ERROR: file not found or empty or null" + pathToFile);
        }
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String sc = scanner.nextLine();
                if (FileValidator.isValidString(sc)) {
                    result.append(sc).append(";");
                }
            }
            return result.toString();
        } catch (IOException e) {
            LOGGER.log(Level.ERROR, "IO ERROR. The file could not be read.");
            throw new FileIsNotReadExeption("input or output error", e);

        }
    }
}