package by.academy.lesson8.classsss;

public class Wrappers {

    public static void main(String[] args) {

        int i = 5;

        Integer i1 = 5;

        //Integer i2 = new Integer(5);

        Integer i3 = Integer.valueOf(5);

        System.out.println(i);
        System.out.println(Integer.toOctalString(i));
        System.out.println(Integer.toHexString(i));
        System.out.println(Integer.toBinaryString(i));

        double d1 = -1;
        double d2 = 0;
        System.out.println(d1 / d2);






    }
}
