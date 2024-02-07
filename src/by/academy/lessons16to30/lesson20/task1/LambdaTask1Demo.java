package by.academy.lessons16to30.lesson20.task1;

import by.academy.lessons16to30.lesson20.task1.Printable;

public class LambdaTask1Demo {
    public static void main(String[] args) {
        Printable p1 = s -> System.out.println("Hello " + s);
        Printable p2 = s -> System.out.println("Buy " + s);
        Printable p3 = s -> System.out.println("Olleh " + s);
        Printable p4 = s -> System.out.println("Yub " + s);

        p1.print(" Test1");
        p2.print(" Test2");
        p3.print(" Test3");
        p4.print(" Test4");
    }
}
//    Написать лямбда выражение для интерфейса Printable,
//        который содержит один метод void print(String string).
