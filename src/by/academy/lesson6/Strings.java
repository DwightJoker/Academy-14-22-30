package by.academy.lesson6;

import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {

        // Java Java Java. Coding Java. Java best coding language.
        String text = "Java Java Java. Coding Java. Java best coding language.";
//          int indexStart = text.indexOf("Java");

        int size = "Java".length();
//
//          int indexEnd = indexStart + size;
//        System.out.println("Start: " + indexStart + "More" + indexEnd);
//
//        int indexStart1 = text.indexOf("Java", indexEnd);
//        int indexEnd1 = indexStart1 + size;
//
//        System.out.println("Start1: " + indexStart1 + "More" + indexEnd1);

        int indexStart = 0;
        int indexEnd = 0;
        do {
            indexStart = text.indexOf("Java", indexEnd);
            indexEnd = indexStart + size;

            if (indexStart >= 0) {
                System.out.println("Start: " + indexStart + " End: " + indexEnd);
            }
        } while (indexStart >= 0);

        //  int lastIndexStart = text.lastIndexOf("Java");
        //System.out.println("Last index of: " + lastIndexStart);
        System.out.println();


        int lastIndexStart = text.length();
        int lastIndexEnd = 0;

        do {
            lastIndexStart = text.lastIndexOf("Java", lastIndexStart - 1);
            lastIndexEnd = lastIndexStart + size;

            if (lastIndexStart >= 0) {
                System.out.println("End: " + lastIndexStart + " Start: " + lastIndexEnd);
            }
        } while (lastIndexStart >= 0);

        String textChange = text.replace("Java", "JavaScript");
        System.out.println(textChange);




    }
}
