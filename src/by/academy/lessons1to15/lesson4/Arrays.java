package by.academy.lessons1to15.lesson4;

public class Arrays {

    public static void main(String[] args) {

        int[] ints = new int[10];
        System.out.println(ints);

        ints[4] = 100;
        for (int i = 0; i < ints.length; i++) {

            System.out.println(ints[i]);
        }
    }
}
