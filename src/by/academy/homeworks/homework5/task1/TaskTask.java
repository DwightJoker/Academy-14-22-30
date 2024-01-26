package by.academy.homeworks.homework5.task1;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TaskTask {
    public static void main(String[] args) {

        List<Integer> list = List.of(2, 4, 4, 5,5,6,8,9,9);
        System.out.println(list);
        System.out.println(removeDuplicates(list));

    }

    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}
