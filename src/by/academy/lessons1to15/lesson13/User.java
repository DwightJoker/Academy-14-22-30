package by.academy.lessons1to15.lesson13;

public class User {

    private static String login;
    private static String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
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
    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    public static class Query{
        public void printToLog(){
            System.out.println("User with login: " + login + " with password: " + password + " Send request");
        }
    }
//    public void createQuery() {
//        class Query{
//            public void printToLog(){
//                System.out.println("User with login: " + login + " with password: " + password + " Send request");
//            }
//
//        }
//        Query query = new Query();
//        query.printToLog();
//    }

}
