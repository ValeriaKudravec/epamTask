package epam.tasks.task1.exeption;

public class EmptyArrayExeption extends RuntimeException {
    public EmptyArrayExeption() {
        super();
    }

    public EmptyArrayExeption(String message) {
        super(message);
    }

    public EmptyArrayExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyArrayExeption(Throwable cause) {
        super(cause);
    }

    protected EmptyArrayExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

