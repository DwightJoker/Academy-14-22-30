package by.academy.lessons1to15.lesson14;

import java.util.ArrayList;
import java.util.List;

public class HeavyBoxArrayList {

    public static void main(String[] args) {


        List arrayList = new ArrayList();
        List arrList2 = List.of(20, 30, 40);
        arrayList.add(new HeavyBox(45, "box1"));
        arrayList.add(new HeavyBox(50, "box2"));
        arrayList.add(new HeavyBox(55, "box3"));
        arrayList.add(new HeavyBox(60, "box4"));
        for(Object b : arrayList) {
            System.out.println(b);
        }

        System.out.println();

        arrayList.remove("box4");
        for(Object b : arrayList) {
            System.out.println(b);
        }

        System.out.println();

        arrayList.remove(2);
        for(Object b : arrayList) {
            System.out.println(b);
        }

        System.out.println();

        arrayList.forEach(b-> System.out.println(b));

        System.out.println();

        arrayList.removeAll(arrayList);
        System.out.println("remove" + arrayList);

        System.out.println();

        arrayList.clear();
        System.out.println("res" + arrayList);

        System.out.println();

        arrayList.addAll(arrList2);
        System.out.println(arrayList);






    }

}
