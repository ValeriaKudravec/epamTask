package epam.tasks.task1.inputClass;

import java.util.ArrayList;
import java.util.List;

public class ParseString {
    static public List<Double> parseLineToArray(String string){
        Validator validator = new Validator();
        List<Double> array = new ArrayList<>();
        if (validator.validate(string)) {
            for (String number : string.split("\\s+")) {
                array.add(Double.parseDouble(number));
            }
            return array;
        }
        return null;
    }
}
