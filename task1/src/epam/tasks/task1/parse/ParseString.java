package epam.tasks.task1.parse;

import epam.tasks.task1.validation.Validator;

import java.util.ArrayList;
import java.util.List;

public class ParseString {
    public  List<Double> lineParser(String string){
        List<Double> array = new ArrayList<>();
            for (String number : string.split("\\s+")) {
                array.add(Double.parseDouble(number));
            }
            return array;

    }
}
