package by.academy.homework2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество слов для обработки: ");
        int wordsAmountToProcess = sc.nextInt();

        System.out.print("Введите слова: ");
        String enteredWords = sc.nextLine();
        enteredWords = sc.nextLine();
        String[] words = enteredWords.split(" ");

        String result = " ";

        if (words.length == wordsAmountToProcess) {

            for (int i = 0; i <= wordsAmountToProcess - 1; i++) {

                if (i == 0) {
                    result = words[i];
                }

                if (words[i].length() < result.length()) {
                    result = words[i];
                }
            }
        }
        System.out.println(result);

        sc.close();

    }

}
