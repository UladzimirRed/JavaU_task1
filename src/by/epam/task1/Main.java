package by.epam.task1;

import by.epam.task1.action.Action;
import by.epam.task1.parser.FileParser;
import by.epam.task1.reader.FileReader;

import java.util.List;


public class Main {

    private static final String FILEPATH = "data\\file.txt";

    public static void main(String[] args) {

        FileReader reader = new FileReader();
        List<String> arrStrings = reader.readFile(FILEPATH);
        FileParser parse = new FileParser();
        List<Integer> list = parse.parser(arrStrings);
        System.out.println("List is \n" + list);
        Action action = new Action();
        action.sort(list);
        System.out.println("max value of array is " + action.findMax(list));
        System.out.println("min value of array is " + action.findMin(list));
        System.out.println("sum of all numbers is " + action.findSum(list));
    }
}





