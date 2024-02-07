package by.academy.homeworks.homework5.task5;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
        public static void main(String[] args) {

            String text = "Порше - Замены не существует";

            
            Map<Character, Integer> map = new HashMap<>();
            for(char c : text.toCharArray()) {

                if(map.containsKey(c)){
                    map.put(c, map.get(c) + 1);
                }else {
                    map.put(c, 1);
                }

            }
            System.out.println("Dictionary: " + map.toString());


//            Map<Character, Integer> map1 = new HashMap<>();
//            String lowerCaseText = text.toLowerCase();
//            for (int i = 0; i < lowerCaseText.length(); i++) {
//                Character uniqueChars = lowerCaseText.charAt(i);
//                Integer counter = map1.get(uniqueChars);
//                if (counter == null) {
//                    counter = 1;
//                    map1.put(uniqueChars, counter);
//                } else {
//                    counter += 1;
//                    map1.put(uniqueChars, counter);
//                }
//            }
//            System.out.println("Dictionary: " + map1.toString());
        }
}
