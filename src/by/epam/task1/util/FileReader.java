package by.epam.task1.util;

import by.epam.task1.exeption.FileIsNotExistException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class FileReader {

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
            throw new FileIsNotExistException("FATAL ERROR: file is incorrect!", e);
        }
    }
}