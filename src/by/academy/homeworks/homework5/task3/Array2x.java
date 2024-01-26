package by.academy.homeworks.homework5.task3;

import java.util.Collections;
import java.util.Iterator;

public class Array2x<T> implements Iterator<Integer> {
    private Integer[][] array;
    private int i, j;
    public Array2x(Integer[][] array) {
        this.array = array;
    }
    @Override
    public boolean hasNext() {
        return i < array.length && j < array[i].length;
    }
    @Override
    public Integer next() {
        Integer element = array[i][j++];
        if (i < array.length && j >= array[i].length) {
            i++;
            j = 0;
        }
        return element;
    }

    public static void main(String[] args) {
        Integer[][] array = new Integer[][]{{4, 25, 5, 3, 77},{8, 99, 1, 111, 32}};
        Array2x iterator = new Array2x(array);
        for (;iterator.hasNext();) {
            System.out.println(iterator.next());
        }
    }
}
