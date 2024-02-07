package by.academy.lessons16to30.lesson20;

import java.util.function.Predicate;

public class LambdaTask2Demo {

    public static void main(String[] args) {

        Predicate <String> predicate = s -> s != null;

        System.out.println(predicate.test(null));
        System.out.println(predicate.test("Hello"));
    }
}
//    Создать лямбда выражение, которое возвращает значение true,
//    if строка не null, используя функциональный интерфейс Predicate.
