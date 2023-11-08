package by.academy.lesson2DZ.operator4;

import java.util.Scanner;

public class Moreless {

    public static void main(String[] args) {

        Scanner xxx = new Scanner(System.in);
        System.out.println("Enter value: ");
        double n1 = xxx.nextDouble();

        if (n1>0){
            System.out.println("Positive");
        } else if (n1<0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("0");
        }
    }
}
