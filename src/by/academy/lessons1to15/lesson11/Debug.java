package by.academy.lessons1to15.lesson11;

import by.academy.lessons1to15.lesson8.deal.User;

public class Debug {
    public static void main(String[] args) {
        User u = new User();
        Integer i = 1;

        i++;
        i = 5 + ++i;
        i +=10;
        System.out.println(i);
    }
}
