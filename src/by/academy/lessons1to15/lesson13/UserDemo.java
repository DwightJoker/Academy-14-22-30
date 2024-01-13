package by.academy.lessons1to15.lesson13;

public class UserDemo {

    public static void main(String[] args) {

       // new User("admin", "123").new Query().printToLog();

        User user1 = new User("admin", "456"){};
//        user1.new Query().printToLog();


        User user2 = new User("admin", "789");
        user2.createQuery();
    }
}
