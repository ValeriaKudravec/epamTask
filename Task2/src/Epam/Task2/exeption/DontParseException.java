package Epam.Task2.exeption;

import java.text.ParseException;

public class DontParseException extends RuntimeException {
    public DontParseException(){

    }
    public DontParseException(String messange) {
        System.out.println(messange);
    }

    public DontParseException(String message, Throwable cause) {
        super(message, cause);
    }

    public DontParseException(Throwable cause) {
        super(cause);
    }

    public DontParseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
