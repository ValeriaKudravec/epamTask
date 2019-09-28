package epam.task1.validationClass;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Validator {
    public boolean validate(String inputString){
        boolean isRight = true;
        try {

            String[] arrayOfNumbers = inputString.split(" ");
            for (String item : arrayOfNumbers) {
                double d = Double.parseDouble(item);
            }
        }
        catch (Exception e){
            isRight = false;
        }
        return isRight;
    }
}