package by.academy.lessons1to15.lesson3;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите месяц");
        String m = sc.next();

        switch (m) {
            case "Январь":
                System.out.println("1");
                break;
            case "Февраль":
                System.out.println("2");
                break;
            case "Март":
                System.out.println("3");
                break;
            case "Апрель":
                System.out.println("4");
                break;
            case "Май":
                System.out.println("5");
                break;
            case "Июнь":
                System.out.println("6");
                break;
            case "Июль":
                System.out.println("7");
                break;
            default:
                System.out.println("Error");
        }









      //  boolean isWinter = true;
    //    System.out.println(isWinter ? "шапка" : "без" );
    }
}

