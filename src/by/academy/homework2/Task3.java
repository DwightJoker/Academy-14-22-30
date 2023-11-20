package by.academy.homework2;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите первое слово: ");
        String firstWord = sc.nextLine();

        System.out.print("Введите второе слово: ");
        String secondWord = sc.nextLine();

        int firstWordSize = firstWord.length();
        int secondWordSize = secondWord.length();

        if(firstWordSize %2 == 0 && secondWordSize %2 == 0) {

            int firstHalfOfFirstWordSize = firstWordSize / 2;
            int secondHalfOfSecondWordSize = secondWordSize / 2;

            String firstHalfOfFirstWord = firstWord.substring(0, firstHalfOfFirstWordSize);
            String secondHalfOfSecondWord = secondWord.substring(secondHalfOfSecondWordSize);

            System.out.println(firstHalfOfFirstWord + secondHalfOfSecondWord);

        } else {
            System.out.println("Ошибка");
        }

        sc.close();

    }

}
