package epam.tasks.task1.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public boolean validate(String inputString){
        boolean isRight = true;
            Pattern p = Pattern.compile("(\\s*\\d+\\.\\d+\\s+)");
            Matcher m = p.matcher(inputString);
            return m.find();
    }
}