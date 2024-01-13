package by.academy.lessons1to15.lesson4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter :");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + i;
            System.out.println("Result :" + sum);

        }

    }
}
