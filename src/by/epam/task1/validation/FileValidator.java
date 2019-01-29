package by.epam.task1.validation;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FileValidator {

    public static final String VALID_PATTERN = "(\\d+;)*(\\d+)";

    public static boolean checkExist(File file) {

        if (file == null || !file.exists() || file.length() == 0) {
            return false;
        }
        return true;
    }

    public static boolean isValidString(String sc) {
        Pattern pattern = Pattern.compile(VALID_PATTERN);
        Matcher matcher = pattern.matcher(sc);
        return matcher.matches();
    }
}