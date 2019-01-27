package by.epam.task1.action;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collections;
import java.util.List;


public class Action {

    private static final Logger LOGGER = LogManager.getLogger(Action.class);

    public int findMax(List<Integer> list) {
        int maxNumber = Collections.max(list);
        return maxNumber;
    }

    public int findMin(List<Integer> list) {
        int minNumber = Collections.min(list);
        return minNumber;
    }

    public int findSum(List<Integer> list) {
        int valueSum = 0;
        for (int element : list) {
            valueSum += element;
        }
        return valueSum;
    }

    public void sort(List<Integer> list) {
        int sortedList = 0;
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        LOGGER.log(Level.INFO,"sorted list is \n" + list.toString());
    }
}





