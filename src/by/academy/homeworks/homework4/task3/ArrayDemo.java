package by.academy.homeworks.homework4.task3;

import java.util.Scanner;

public class ArrayDemo {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Array<Integer> array = new Array<Integer>(10);
        System.out.println(array);

        array.add(10);
        array.add(33);
        array.add(25);
        array.add(13);
        array.add(46);
        array.add(7);
        array.add(88);
        array.add(99);
        array.add(11);
        array.add(22);
        array.add(38);
        System.out.println(array);

        System.out.print("Enter element index: ");
        int elementByIndex = sc.nextInt();
        array.getElementByIndex(elementByIndex);

        System.out.println("First element : " + array.getFirstElement());
        System.out.println("Last element: " + array.getLastElement());
        System.out.println("Array size: " + array.getArraySize());
        System.out.println("Index of last element: " + array.getLastFilledElement());

        System.out.print("Delete element by index: ");
        int deleteByIndex = sc.nextInt();
        array.deleteElementByIndex(deleteByIndex);
        System.out.println(array);

        System.out.print("Delete element by value: ");
        int deleteByValue = sc.nextInt();
        array.deleteElementByValue(deleteByValue);
        System.out.println(array);
    }
}
