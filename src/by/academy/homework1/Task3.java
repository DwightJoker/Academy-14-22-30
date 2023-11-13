package by.academy.homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner tabl = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num1 = tabl.nextInt();

        System.out.println(num1 + "*" + "1" + "=" + num1*1);
        System.out.println(num1 + "*" + "2" + "=" + num1*2);
        System.out.println(num1 + "*" + "3" + "=" + num1*3);
        System.out.println(num1 + "*" + "4" + "=" + num1*4);
        System.out.println(num1 + "*" + "5" + "=" + num1*5);
        System.out.println(num1 + "*" + "6" + "=" + num1*6);
        System.out.println(num1 + "*" + "7" + "=" + num1*7);
        System.out.println(num1 + "*" + "8" + "=" + num1*8);
        System.out.println(num1 + "*" + "9" + "=" + num1*9);
        System.out.println(num1 + "*" + "10" + "=" + num1*10);

       // for (int i = 0; i < 10; i++) {
       //     System.out.println(num1 + "x" + (i + 1) + "=" + (num1 * (i+1)));
        //}

    }
}
