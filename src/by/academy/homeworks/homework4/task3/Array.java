package by.academy.homeworks.homework4.task3;

import java.util.Arrays;

public class Array<T> {
    private T[] array;
    private int current;

    public Array() {
        this.array = (T[]) new Object[16];
    }

    public Array(int i) {
        super();
        this.array = (T[]) new Object[i];
    }

    public void increaseArray() {
        T[] newArray = (T[]) new Object[array.length * 2 + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public void add(T obj) {
        if (array == null) {
            array = (T[]) new Object[16];
            current = 0;
        }
        if (current >= array.length) {
            increaseArray();
        }
        array[current++] = obj;
    }

    public void getElementByIndex(int i) {
        if (i >= this.current || i < 0) {
            System.out.println("Wrong index");
        } else {
            System.out.println(array[i]);
        }
    }

    public T getLastElement() {
        return (T) array[current - 1];
    }

    public T getFirstElement() {
        return (T) array[0];
    }

    public int getArraySize() {
        return array.length;
    }

    public int getLastFilledElement() {
        return current - 1;
    }

    public void deleteElementByIndex(int i) {
        if (i > array.length || i < 0) {
            System.out.println("Error. Wrong index. Try again later.");
            return;
        }
        if (i != array.length - 1) {
            System.arraycopy(array, i + 1, array, i, array.length - i - 1);
        }
        array[--current] = null;
    }

    public void deleteElementByValue(T object) {
        for (int i = 0; i < this.current; i++) {
            if (array[i] == object) {
                System.arraycopy(array, i + 1, array, i, array.length - i - 1);
                array[--current] = null;
                return;
            }
        }
        System.out.println("Number is not in array");
    }

    @Override
    public String toString() {
        return "Array" + Arrays.toString(array);
    }
}