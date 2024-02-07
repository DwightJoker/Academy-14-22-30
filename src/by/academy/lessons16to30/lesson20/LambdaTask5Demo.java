package by.academy.lessons16to30.lesson20;

import java.util.function.Predicate;

public class LambdaTask5Demo {
    public static void main(String[] args) {

        Predicate<String> predicate = s -> s.startsWith("J");
        Predicate<String> predicate1 = s -> s.startsWith("N");
        Predicate<String> predicate2 = s -> s.endsWith("A");

        System.out.println(predicate.or(predicate1).and(predicate2).test("JANA"));
        System.out.println(predicate.or(predicate1).and(predicate2).test("JAN"));

    }
}
