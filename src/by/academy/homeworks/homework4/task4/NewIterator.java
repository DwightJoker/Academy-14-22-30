package by.academy.homeworks.homework4.task4;

import java.util.Iterator;

public class NewIterator<T> implements Iterator<T> {

    private T[] array;
    private int index;


    public NewIterator(T[] array) {
        this.array = array;
    }


    @Override
    public boolean hasNext() {
        if (array == null || array.length <= index) {
            return false;
        }
        return array[index] != null;
    }

    @Override
    public T next() {
        return array[index++];
    }
}
