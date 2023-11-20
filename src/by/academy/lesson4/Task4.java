package by.academy.lesson4;

public class Task4 {
    public static void main(String[] args) {


        for (int i = 0; i <= 100; i++) {
            if (i % 13 == 0) {
                System.out.println("пропуск");
                continue;
            }
            System.out.println(i);
        }
    }
}
