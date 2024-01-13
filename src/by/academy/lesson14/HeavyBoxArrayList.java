package by.academy.lesson14;

import java.util.ArrayList;

public class HeavyBoxArrayList {

    public static void main(String[] args) {

        HeavyBox box1 = new HeavyBox(200,200, 200, 5);
        HeavyBox box2 = new HeavyBox(200,200, 200, 6);
        HeavyBox box3 = new HeavyBox(200,200, 200, 7);
        HeavyBox box4 = new HeavyBox(200,200, 200, 8);

        ArrayList arrayList = new ArrayList();
        arrayList.add(0, box1);
        arrayList.add(1, box2);
        arrayList.add(2, box3);
        arrayList.add(3, box4);
        for(Object b : arrayList) {
            System.out.println(b);
        }

        System.out.println();

        arrayList.remove(box4);
        for(Object b : arrayList) {
            System.out.println(b);
        }

        System.out.println();

        arrayList.remove(2);
        for(Object b : arrayList) {
            System.out.println(b);
        }






    }

}
