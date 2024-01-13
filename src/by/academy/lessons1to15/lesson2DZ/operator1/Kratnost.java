package by.academy.lessons1to15.lesson2DZ.operator1;
import java.util.Scanner;

public class Kratnost {
    public static void main(String[] args) {
        Scanner kr = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = kr.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = kr.nextInt();


        if (num1 % num2 != 0) {
            System.out.println("Не кратно");
        }
        else {
            System.out.println("Кратно");
        }

    }
}
