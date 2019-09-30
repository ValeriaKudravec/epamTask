package epam.tasks.task1.input;

import epam.tasks.task1.parse.ParseString;
import epam.tasks.task1.validation.Validator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayReader {
    public List<String> readArray(String fileName){
        Validator validator = new Validator();
        List<String> stringArray = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if(validator.validate(line)) {
                    stringArray.add(line);

                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return stringArray;
    }

}
