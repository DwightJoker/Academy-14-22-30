package by.academy.lesson4;

import java.sql.SQLOutput;

public class Task5 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++){
                System.out.println(i * j);
                if (j == 5) {
                    break;
                }
            }
        }
    }
}
