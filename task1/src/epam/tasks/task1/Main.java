package epam.tasks.task1;


import epam.tasks.task1.exeption.EmptyArrayExeption;
import epam.tasks.task1.inputClass.InputString;
import epam.tasks.task1.inputClass.Validator;
import epam.tasks.task1.actionClass.Sorts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
                Sorts sorts = new Sorts(line);
                sorts.insertionSort();
                sorts.gerArray().forEach(item->System.out.print(item + " "));
            }

        }
        catch (EmptyArrayExeption e){
            e.printStackTrace();
        }
    }
}
