package by.academy.homeworks.homework5.task4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class StudentMarks {
    public static void main(String[] args) {
        int numOfStud = 5;
        ArrayList<Integer> journal = new ArrayList<>(numOfStud);

        for (int i = 0; i < numOfStud; i++) {
            int a = (int) (Math.random() * 10 + 1);
            journal.add(a);
        }
        System.out.println(journal);

        for (Iterator<Integer> iter = journal.iterator(); iter.hasNext();) {
            int max = journal.get(0);
            for (Integer i : journal) {
                if(i >= max)
                    max = i;
            }
            System.out.println("Max mark: " + max);
            break;
        }
    }

}
