package exceptions;

public class WrongValueException extends Exception{
    public WrongValueException(String alert) {
        super(alert);
    }

    public WrongValueException() {
    }

    public WrongValueException(String message, Throwable cause) {
        super(message, cause);
    }
}
