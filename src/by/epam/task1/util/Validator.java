package by.epam.task1.util;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validator {

    public static final String VALID_PATTERN = "(\\d+;)*(\\d+)";

    public static boolean isValidString(String sc) {
        Pattern pattern = Pattern.compile(VALID_PATTERN);
        Matcher matcher = pattern.matcher(sc);
        return matcher.matches();
    }
}