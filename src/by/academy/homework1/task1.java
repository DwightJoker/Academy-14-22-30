package by.academy.homework1;

import java.security.spec.RSAOtherPrimeInfo;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        Scanner discount = new Scanner(System.in);
        System.out.print("Введите сумму покупки: ");
        double price = discount.nextDouble();

        System.out.print("Введите возраст покупателя: ");
        double age = discount.nextDouble();

        double sum;

        if (price < 99) {
            sum = price - (price * 5 / 100);
            System.out.println("Итоговая стоимость: " + sum);
        } else if (100 < price && price < 199) {
            sum = price - (price * 7 / 100);
            System.out.println("Итоговая стоимость: " + sum);
        } else if (200 < price && price < 299) {
            if (age > 18) {
                sum = price - (price * (12 + 4) / 100);
                System.out.println("Итоговая стоимость: " + sum);
            }
            else {
                sum = price - (price * (12 - 3) / 100);
                System.out.println("Итоговая стоимость: " + sum);
            }
        } else if (300 < price && price < 399) {
            sum = price - (price * 15 / 100);
            System.out.println("Итоговая стоимость: " + sum);
        } else if (price > 400) {
            sum = price - (price * 20 / 100);
            System.out.println("Итоговая стоимость: " + sum);
        }

    }
}
