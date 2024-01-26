package by.academy.homeworks.homework5.task5;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
        public static void main(String[] args) {

            String text = "Порше - Замены не существует";
            String lowerCaseText = text.toLowerCase();

            Map<Character, Integer> map = new HashMap<>();

            for (int i = 0; i < lowerCaseText.length(); i++) {
                Character uniqueChars = lowerCaseText.charAt(i);
                Integer counter = map.get(uniqueChars);
                if (counter == null) {
                    counter = 1;
                    map.put(uniqueChars, counter);
                } else {
                    counter += 1;
                    map.put(uniqueChars, counter);
                }
            }
            System.out.println("Dictionary: " + map.toString());
        }
}
