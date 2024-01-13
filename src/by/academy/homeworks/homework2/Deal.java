package by.academy.homeworks.homework2;

import java.util.Scanner;

public class Deal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество игроков: ");
        int participantsAmount = sc.nextInt();

        int playerCards = 5;

        if (participantsAmount >= 2 && participantsAmount <= 9) {

            String[] cardMasti = {"Пик", "Бубен", "Черв", "Крест"};
            String[] mainCards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

            int n = cardMasti.length * mainCards.length;

            String[] koloda = new String[n];
            for (int i = 0; i < mainCards.length; i++) {
                for (int j = 0; j < cardMasti.length; j++) {
                    koloda[cardMasti.length * i + j] = mainCards[i] + " " + cardMasti[j];
                }
            }

            for (int i = 0; i < n; i++) {
                int random = i + (int) (Math.random() * (n - i));
                String res = koloda[random];
                koloda[random] = koloda[i];
                koloda[i] = res;
            }

            for (int i = 0; i < participantsAmount * playerCards; i++) {
                System.out.println(koloda[i]);
                if (i % playerCards == playerCards - 1) {
                    System.out.println();
                }
            }

        } else {
            System.out.println("Неверное количество игроков");
        }
    }
}
