package by.academy.lessons1to15.lesson6;

public class Strings2 {

    public static void main(String[] args) {

        String text = "Java Java Java. Coding Java. Java best coding language.";

        String string1 = text.substring(0, 14);
        System.out.println(string1);

        String string2 = text.substring(16, 50);
        System.out.println(string2);
    }
}
