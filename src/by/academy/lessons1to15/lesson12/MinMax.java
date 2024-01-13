package by.academy.lessons1to15.lesson12;

public class MinMax<T extends Comparable<T>> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T minArrayElement() {
        if (array.length > 0) {
            T min = array[0];
            for (T t : array) {
                if (min == null) {
                    continue;
                }
                if (t.compareTo(min) < 0) {
                    min = t;
                }
            }
            return min;
        }
        return null;
    }

    public T maxArrayElement() {
        if (array.length > 0) {
            T max = array[0];
            for (T t : array) {
                if (max == null) {
                    continue;
                }
                if (t.compareTo(max) < 0) {
                    max = t;
                }
            }
            return max;
        }
        return null;
    }
}
