package task1;

import task1.actionClass.Sorts;
import task1.validationClass.Validator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new File("input/inputFile.txt"))){
            Validator validator = new Validator();
            List<List<Double> > array = new ArrayList<>();
            int counter = 0;
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(validator.validate(line)){
                    array.add(new ArrayList<>());
                    for (String number:line.split(" +")) {
                        array.get(array.size()-1).add(Double.parseDouble(number));
                    }
                    System.out.println(line);
                    Sorts sorts = new Sorts(array.get(counter));
                    sorts.insertionSort();
                    sorts.gerArray().forEach(item->System.out.print(item + " "));
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("file is not found");
        }


    }
}
