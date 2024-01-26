package by.academy.lesson17;

public class WrongLoginException extends Exception{

    private String mess;

    public WrongLoginException(String s) {
    }

    public WrongLoginException(String message, String messages) {
        super(message);
        mess = messages;
    }

    @Override
    public String toString() {
        return "WrongLoginException: " + mess;
    }

}
