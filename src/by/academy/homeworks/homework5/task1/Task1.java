package by.academy.homeworks.homework5.task1;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(0,1);
        list.add(2);
        list.add(2,3);
        list.add(4);
        list.add(4,4);
        list.add(5);
        list.add(5,5);

        System.out.println(list);

        removeDuplicates(list);
        System.out.println(list);
    }

    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        Set<T> set = new LinkedHashSet<>(collection);
        collection.clear();
        collection.addAll(set);
        return collection;

    }
}
//        list.stream().distinct();
//        Set<Integer> set = new HashSet<>(list);
//        list.clear();
//        list.addAll(set);
//        System.out.println(list);