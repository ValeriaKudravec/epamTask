package Epam.task2.necklace.exeption;

public class ParseLineException extends RuntimeException {
    public ParseLineException(){

    }
    public ParseLineException(String messange) {
        System.out.println(messange);
    }

    public ParseLineException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParseLineException(Throwable cause) {
        super(cause);
    }

    public ParseLineException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
