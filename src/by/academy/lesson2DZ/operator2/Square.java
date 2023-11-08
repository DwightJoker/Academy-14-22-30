package by.academy.lesson2DZ.operator2;
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Circle Radius: ");
        double radius = input.nextDouble();

        double diameter = (3.14 * radius * radius);
        System.out.print("Square: " + diameter);
    }
}
