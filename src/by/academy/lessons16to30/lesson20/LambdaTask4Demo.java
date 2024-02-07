package by.academy.lessons16to30.lesson20;

import java.util.function.Predicate;

public class LambdaTask4Demo {
    public static void main(String[] args) {

        Predicate<String> predicate = s -> s != null;
        Predicate<String> predicate1 = s -> !s.isEmpty();

        Predicate<String> predicate2 = predicate.and(predicate1);

        System.out.println(predicate2.test(null));
        System.out.println(predicate2.test("11"));
        System.out.println(predicate2.test(""));
        System.out.println(predicate2.test("null"));


    }
}
