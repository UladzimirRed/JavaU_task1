package by.epam.task1.main;

import by.epam.task1.action.Action;
import by.epam.task1.parser.FileParser;
import by.epam.task1.reader.FileReader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;


public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);
    private static final String FILEPATH = "data\\file.txt";

    public static void main(String[] args) {
        FileReader reader = new FileReader();
        List<String> arrStrings = reader.readFile(FILEPATH);
        FileParser parse = new FileParser();
        List<Integer> list = parse.parser(arrStrings);
        LOGGER.log(Level.INFO,"List is \n" + list);
        Action action = new Action();
        action.sort(list);
        LOGGER.log(Level.INFO, "max value of array is " + action.findMax(list));
        LOGGER.log(Level.INFO,"min value of array is " + action.findMin(list));
        LOGGER.log(Level.INFO,"sum of all numbers is " + action.findSum(list));
    }
}





