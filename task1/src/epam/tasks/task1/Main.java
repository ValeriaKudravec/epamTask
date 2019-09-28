package epam.tasks.task1;

import Epam.tasks.task1.Exeptions.NullArrayExeption;
import Epam.tasks.task1.validationClass.Validator;
import Epam.tasks.task1.actionClass.Sorts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
                    for (String number : line.split("\\s+")) {
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
                System.out.println("Hello");
                throw new NullArrayExeption("you are input null array");
            }
            for (List<Double> line:array) {
                Sorts sorts = new Sorts(line);
                sorts.insertionSort();
                sorts.gerArray().forEach(item->System.out.print(item + " "));
            }

        }
        catch (NullArrayExeption e){
            e.printStackTrace();
        }
    }
}
