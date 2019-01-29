package by.epam.task1.parser;


public class FileParser {
    public static int[] parse(String line){
        String [] arrayString = line.split(";");
        int [] arrayInt = new int[arrayString.length];
        for (int i = 0; i < arrayString.length; i++){
            arrayInt[i] = Integer.parseInt(arrayString[i]);
        }
        return arrayInt;
    }
}