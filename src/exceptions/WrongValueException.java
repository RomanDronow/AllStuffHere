package exceptions;

public class WrongValueException extends Throwable{
    public WrongValueException(String alert) {
        super(alert);
    }
}
