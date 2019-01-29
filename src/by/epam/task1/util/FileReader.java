package by.epam.task1.util;

import by.epam.task1.exeption.FileIsNotExistException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class FileReader {

    private final static  Logger LOGGER = LogManager.getLogger();

    public static String readFile(String pathToFile) throws FileIsNotExistException {
        File file = new File(pathToFile);
        StringBuilder result = new StringBuilder();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String sc = scanner.nextLine();
                if (Validator.isValidString(sc)) {
                    result.append(sc).append(";");
                }
            }
            return result.toString();
        } catch (IOException e) {
            LOGGER.log(Level.ERROR, "FATAL ERROR: file is incorrect!");
            throw new FileIsNotExistException("FATAL ERROR: file not found or empty or null", e);
        }
    }
}