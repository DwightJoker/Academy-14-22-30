package by.academy.lesson2DZ.calculator;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner calc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double num1 = calc.nextDouble();

        System.out.print("Enter number 2: ");
        double num2 = calc.nextDouble();

        double res;

        System.out.print("Enter action: ");
        String action = calc.nextLine();
        action = calc.nextLine();

        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.println("Result: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Result: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Result: " + res);
                break;
            case "/":
                res = num1 / num2;
                System.out.println("Result: " + res);
                break;
        }
        // double res2 = num1 - num2;
        // double res3 = num1 * num2;
        // double res4 = num1 / num2;

       // System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" + res4);


    }
}
