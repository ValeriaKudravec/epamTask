package epam.tasks.task1;


import epam.tasks.task1.action.doublestraemclass.Actions;
import epam.tasks.task1.exeption.EmptyArrayExeption;
import epam.tasks.task1.input.ArrayReader;
import epam.tasks.task1.parse.ParseString;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static String fileName = "input/inputFile.txt";


    public static void main(String[] args) {
        try{
            ArrayReader readStringArray = new ArrayReader();
            ParseString parseString = new ParseString();
            List<String> arrays= readStringArray.readArray(fileName);
            if(arrays==null){
                throw new EmptyArrayExeption("Empty array");
            }
            for (String line:arrays) {
                List<Double> doubleArray = new ArrayList<>(parseString.lineParser(line));
                Actions sorts = new Actions(doubleArray);
                sorts.sort();
                sorts.gerArray().forEach(item->System.out.print(item + " "));
                System.out.println("max " + sorts.max());
                System.out.println("sum " + sorts.sum());
            }

        }
        catch (EmptyArrayExeption e){
            e.printStackTrace();
        }
    }
}
