package by.academy.homework1;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        Scanner task2 = new Scanner(System.in);
        System.out.println("Введите тип данных: ");
        String type = task2.nextLine();

        System.out.println("Введите переменную: ");
        float value = task2.nextFloat();

        float result;

        switch (type) {
            case "int":
                result = value / 2;
                System.out.println("Result: " + result);
                break;
            case "double":
                result = value - (value * 70 / 100);
                System.out.println("Result: " + result);
                break;
            case "float":
                result = value * value;
                System.out.println("Result: " + result);
                break;
            case "char":
                char firstChar = type.charAt(0);
                System.out.println("Result: " + firstChar);
                break;
            case "String":
                System.out.println("Hello " + value);
                break;
            default:
                System.out.println("Не поддерживаемый тип");
                break;
        }
    }
}
