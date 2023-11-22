package by.academy.lesson6;

public class Task3Replace {

    public static void main(String[] args) {

        String text = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";

        StringBuilder sb = new StringBuilder();
        int start = text.length();
        int end = 0;
        int size = "Object-oriented programming".length();

        do {
            start = text.indexOf("Object-oriented programming", end);
            end = start + size;

            if (start >= 0) {
                System.out.println(start);
            }
        } while (start >= 0);

        String x = text.replaceAll("Object-oriented programming", "OOP");

//        if (x % 2 == 0) {
//            String textChange = text.replace("Object-oriented programming", "OOP");
//            System.out.println(textChange);
//        }
        System.out.println(x);

    }

}


