package by.academy.lessons1to15.lesson2DZ.operator3;

import java.util.Scanner;

public class SP {

    public static void main(String[] args) {

            Scanner sp = new Scanner(System.in);
            System.out.print("Enter length: ");
            double m1 = sp.nextDouble();

            System.out.print("Enter width: ");
            double m2 = sp.nextDouble();

            double result;

            System.out.print("Enter action: ");
            String action = sp.nextLine();
            action = sp.nextLine();

    switch (action) {

        case "s":
        case "S":
            result = m1 * m2;
            System.out.println("Square: " + result);
            break;
        case "p":
        case "P":
            result = (m1 + m2) * 2;
            System.out.println("Perimeter: " + result);
            break;

    }




    }
}
