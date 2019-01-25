package by.epam.task1.action;

import java.util.Collections;
import java.util.List;


public class Action {

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
        System.out.println("Sorted list is: ");
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        System.out.println(list.toString());
    }
}





