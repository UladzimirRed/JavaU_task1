package by.epam.task1.main;

import by.epam.task1.action.Action;
import by.epam.task1.parser.FileParser;
import by.epam.task1.reader.FileReader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Arrays;


public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    private static final String FILE_PATH = "data\\file.txt";

    public static void main(String[] args) {
        String line = FileReader.readFile(FILE_PATH);
        int[] arrayInt = FileParser.parse(line);
        LOGGER.log(Level.INFO, "Array of integer is \n" + Arrays.toString(arrayInt));
        Action action = new Action();
        action.sortArray(arrayInt);
        LOGGER.log(Level.INFO, "sorted array is \n" + Arrays.toString(arrayInt));
        LOGGER.log(Level.INFO, "max value of array is " + action.getMax(arrayInt));
        LOGGER.log(Level.INFO, "min value of array is " + action.getMin(arrayInt));
        LOGGER.log(Level.INFO, "sum of all numbers is " + action.getSum(arrayInt));
    }
}