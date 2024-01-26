package by.academy.homeworks.homework5.task2;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task2 {

    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        LinkedList<Double> linkedList = new LinkedList<>();
        final int N = 1000000;
        final int M = 10000;
        for (int i = 0; i < N; i++) {
            arrayList.add(Math.random());
            linkedList.add(Math.random());
        }
        extractedAL(arrayList, N, M);
        extractedLL(linkedList, N, M);
    }

    private static void extractedLL(LinkedList<Double> linkedList, int N, int M) {
        long startTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            linkedList.get((int) (Math.random() * (N - 1)));
        }
        long y = System.currentTimeMillis() - startTime;
        System.out.println("LinkedList time: " + y);
    }

    private static void extractedAL(ArrayList<Double> arrayList, int N, int M) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < M; i++) {
            arrayList.get((int) (Math.random() * (N - 1)));
        }
        long x = System.currentTimeMillis() - startTime;
        System.out.println("ArrayList time: " + x);
    }
}
