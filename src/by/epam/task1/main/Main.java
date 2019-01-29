package by.epam.task1.main;

import by.epam.task1.action.Action;
import by.epam.task1.util.Parser;
import by.epam.task1.util.FileReader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Arrays;


public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    private static final String FILE_PATH = "data\\file.txt";

    public static void main(String[] args) throws Exception {
        try {
            String line = FileReader.readFile(FILE_PATH);
            int[] arrayInt = Parser.parse(line);
            LOGGER.log(Level.INFO, "Array of integer is \n" + Arrays.toString(arrayInt));
            Action action = new Action();
            action.sortArray(arrayInt);
            LOGGER.log(Level.INFO, "sorted array is \n" + Arrays.toString(arrayInt));
            LOGGER.log(Level.INFO, "max value of array is " + action.getMax(arrayInt));
            LOGGER.log(Level.INFO, "min value of array is " + action.getMin(arrayInt));
            LOGGER.log(Level.INFO, "sum of all numbers is " + action.getSum(arrayInt));
        } catch (Exception e) {
            LOGGER.log(Level.ERROR, e);
        }
    }
}