package epam.tasks.task1.inputclass;

import epam.tasks.task1.parse.ParseString;
import epam.tasks.task1.validation.Validator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputString {
    public List<List<Double>> inputArrays(String fileName){
        try(Scanner scanner = new Scanner(new File(fileName))) {
            Validator validator = new Validator();
            List<List<Double>> array = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (validator.validate(line)) {
                    array.add(ParseString.parseLineToArray(line));
                }
            }
            return array;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

}
