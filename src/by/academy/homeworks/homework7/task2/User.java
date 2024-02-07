package by.academy.homeworks.homework7.task2;

import java.util.Date;

public class User extends Person{

    private String login;
    protected String password;
    public String email;

    public User() {
    }

    public User(String firstName, String lastName, String login, String password, String email) {
        super(firstName, lastName);
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public User(String login, String password, String email) {
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public User(String firstName, String lastName, String dateOfBirth, String login, String password, String email) {
        super(firstName, lastName, dateOfBirth);
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void printUsersInfo(){
        System.out.println("1 + 1 = 11");
    }
}
