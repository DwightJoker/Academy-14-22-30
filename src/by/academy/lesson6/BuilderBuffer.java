package by.academy.lesson6;

public class BuilderBuffer {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        sb.append(" ").append("Java").append(123).append('c');

        System.out.println(sb);


        String text = "C#";
        StringBuilder sb1 = new StringBuilder(text);

        System.out.println(sb1);
        sb1.setCharAt(1, '+');
        System.out.println(sb1);







    }
}
