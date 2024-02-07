package by.academy.lessons16to30.lesson20;

import java.util.function.Predicate;

public class LambdaTask3Demo {
    public static void main(String[] args) {

        Predicate<String> predicate = s -> !s.isEmpty();

        System.out.println(predicate.test(null));
        System.out.println(predicate.test("Hello"));
    }
}
//    Создать лямбда выражение, которое проверяет,
//        что строка не пуста, используя функциональный интерфейс Predicate.