package by.academy.homework2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите слово 1: ");
        String wordOne = sc.nextLine();
        char[] mainArray = wordOne.toCharArray();

        System.out.println("Введите слово 2: ");
        String wordTwo = sc.nextLine();
        char[] checkableArray = wordTwo.toCharArray();

        System.out.println(isArraysContainsElements(mainArray, checkableArray));

        sc.close();
    }

    private static boolean isArraysContainsElements(char[] wordOne, char[] wordTwo) {

        if (wordOne.length != wordTwo.length) {
            return false;
        }

        String mainArrayString = String.valueOf(wordOne);
        String secondaryArrayString = String.valueOf(wordTwo);

        for (char x : wordOne) {

            if (!secondaryArrayString.contains(String.valueOf(x))) {
                return false;
            }
        }
        return true;
    }

}
