package by.academy.lessons16to30.lesson17;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginDemo {
    private static Pattern VALIDATION = Pattern.compile("\\w{3,20}");

    public static void main(String[] args) {
        enterCreds();

        login("Admin", "Admin");
        login("Admin1", "Admin1");
        login("Admin2", "Admin3");
        login("admin", "");
    }
public static void login(String username, String password){
    Map<String, String> user = new HashMap<>();
    user.put("Admin", "Admin");
    user.put("Admin1", "Admin1");
    user.put("Admin2", "Admin2");
    if(user.containsKey(username) && password.equals(user.get(username))) {
        System.out.println("Вы вошли в систему");
    }else{
        System.out.println("Неверно введены данные");
    }
}
    public static boolean enterCreds(){
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter login");
        String login = cs.next();
        System.out.println("Enter password");
        String password = cs.next();
        System.out.println("Confirm password");
        String confirmPassword = cs.next();

        try {
            registration(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            return false;
        }finally{
            cs.close();
        }
        return true;
    }

    public static void registration(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        Matcher mLogin = VALIDATION.matcher(login);
        if (login == null || !mLogin.matches()){
            throw new WrongLoginException("Wrong login " + login);
        }
        Matcher mPassword = VALIDATION.matcher(login);
        if (password == null || !mPassword.matches()){
            throw new WrongPasswordException("Wrong password " + password);
        }
        if (!password.equals(confirmPassword)){
        throw new WrongPasswordException("Passwords doesn't match: " + password + " " + confirmPassword);
    }

        System.out.println("Save user to database");
        }

    }