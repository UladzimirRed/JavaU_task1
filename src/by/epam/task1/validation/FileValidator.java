package by.epam.task1.validation;

import java.io.File;


public class FileValidator {

    public boolean checkFile(File file) {

        if (file == null || !file.exists() || file.length() == 0) {
            return false;
        }
        return true;
    }
}