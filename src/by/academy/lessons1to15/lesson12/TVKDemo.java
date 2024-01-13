package by.academy.lessons1to15.lesson12;

import by.academy.lessons1to15.lesson9.Animal;

public class TVKDemo {

    public static void main(String[] args) {
       TVK<String, Animal, Integer> tvk = new TVK<String, Animal, Integer>("911 GT3RS", new Animal(), 5);
        tvk.printAll();
        System.out.println("+++++++++++++++++++++++++++");

        System.out.println(tvk.getV());
        tvk.printV();
        System.out.println("+++++++++++++++++++++++++++");

        System.out.println(tvk.getK());
        tvk.printK();
        System.out.println("+++++++++++++++++++++++++++");

        System.out.println(tvk.getT());
        tvk.printT();
        System.out.println("+++++++++++++++++++++++++++");
    }
}
