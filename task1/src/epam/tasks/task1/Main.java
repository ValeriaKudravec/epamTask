package epam.tasks.task1;


import epam.tasks.task1.actionClass.doubleStraemClass.Actions;
import epam.tasks.task1.exeption.EmptyArrayExeption;
import epam.tasks.task1.inputClass.InputString;
import epam.tasks.task1.actionClass.Sorts;

import java.util.List;

public class Main {
    static String fileName = "input/inputFile.txt";


    public static void main(String[] args) {
        try{
            InputString inputString = new InputString();
            List<List<Double>> arrays= inputString.inputArrays(fileName);
            if(arrays==null){
                throw new EmptyArrayExeption("Empty array");
            }
            for (List<Double> line:arrays) {
                Actions sorts = new Actions(line);
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
