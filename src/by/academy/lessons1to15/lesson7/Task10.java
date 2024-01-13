package by.academy.lessons1to15.lesson7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task10 {

    public static void main(String[] args) {

        String text = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        String x = text.replaceAll("\\s+", " ");
        //String x = text.replaceAll("\\s{2}", " ");

        Pattern pattern = Pattern.compile("Java\\s+\\d");
        Matcher m = pattern.matcher(x);

        while (m.find()) {
            int start = m.start();
            int end = m.end();

            String match = x.substring(start, end);
            System.out.println(match);
        }
    }




}
