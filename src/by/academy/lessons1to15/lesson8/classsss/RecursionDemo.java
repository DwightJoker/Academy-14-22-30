package by.academy.lessons1to15.lesson8.classsss;

public class RecursionDemo {

    static long factorial(int n) {

        if (n < 2) {
            return 1;
        }
        return factorial(n -1) * n;
    }

    public static void main(String[] args) {
        System.out.println("Факториал 3: " + factorial(3));
        System.out.println("Факториал 4: " + factorial(4));
        System.out.println("Факториал 5: " + factorial(5));
    }
}
