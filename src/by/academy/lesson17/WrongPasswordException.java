package by.academy.lesson17;

public class WrongPasswordException extends Exception {

    private String pass;

    public WrongPasswordException(String s) {
    }

    public WrongPasswordException(String message, String password) {
        super(message);
        this.pass = password;
    }

    @Override
    public String toString() {
        return "WrongPasswordException: " + pass;
    }
}
