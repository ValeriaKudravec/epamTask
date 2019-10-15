package epam.tasks.task1.exeption;

public class ParseLineException extends RuntimeException {
    public ParseLineException() {
        super();
    }

    public ParseLineException(String message) {
        super(message);
    }

    public ParseLineException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParseLineException(Throwable cause) {
        super(cause);
    }

    protected ParseLineException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

