package by.academy.lesson17;

public class ExceptionDemo {

    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e){
            System.out.println("error");
        }
    }
}
