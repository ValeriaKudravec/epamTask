package task1;

import task1.Exeptions.NullArrayExeption;
import task1.actionClass.Sorts;
import task1.validationClass.Validator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Main {
    static String inputString = "input/inputFile.txt";
    private static List<List<Double>> input(String inputString){
        try(Scanner scanner = new Scanner(new File(inputString))) {
            Validator validator = new Validator();
            List<List<Double>> array = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (validator.validate(line)) {
                    array.add(new ArrayList<>());
                    for (String number : line.split(" +")) {
                        array.get(array.size() - 1).add(Double.parseDouble(number));
                    }
                    System.out.println(line);
                }
            }
            return array;
        }
         catch(FileNotFoundException e){
            e.printStackTrace();
             return null;
            }

        }

    public static void main(String[] args) {
        try{
            List<List<Double> > array = input(inputString);
            if(array == null){
                throw new NullArrayExeption(e);
            }
            for (List<Double> line:array) {
                Sorts sorts = new Sorts(line);
                sorts.insertionSort();
                sorts.gerArray().forEach(item->System.out.print(item + " "));
            }

        }
        catch (NullArrayExeption e){

        }
    }
}
