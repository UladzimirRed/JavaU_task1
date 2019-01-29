package by.epam.task1.action;


public class Action {

    public int[] sortArray(int[] arrayInt){
        int n = arrayInt.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n-i); j++) {
                if (arrayInt[j - 1] > arrayInt[j]) {
                    temp = arrayInt[j - 1];
                    arrayInt[j - 1] = arrayInt[j];
                    arrayInt[j] = temp;
                }
            }
        }
        return arrayInt;
    }
    public static int getMax(int[] arrayInt){
        int maxValue = arrayInt[0];
        for(int i=1;i < arrayInt.length;i++){
            if(arrayInt[i] > maxValue){
                maxValue = arrayInt[i];
            }
        }
        return maxValue;
    }
    public static int getMin(int[] arrayInt){
        int minValue = arrayInt[0];
        for(int i=1;i<arrayInt.length;i++){
            if(arrayInt[i] < minValue){
                minValue = arrayInt[i];
            }
        }
        return minValue;
    }
    public static int getSum(int[] arrayInt){
        int sum = 0;
        for (int i : arrayInt){
            sum += i;
        }
        return sum;
    }

}