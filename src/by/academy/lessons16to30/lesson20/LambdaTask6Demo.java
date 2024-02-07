package by.academy.lessons16to30.lesson20;

import by.academy.lessons1to15.lesson14.HeavyBox;

import java.util.function.Consumer;

public class LambdaTask6Demo {

    public static void main(String[] args) {

        Consumer<HeavyBox> hb1 = box -> System.out.println("Отгрузили ящик с весом n" + box.getWeight());
        Consumer<HeavyBox> hb2 = box -> System.out.println("Отправляем ящик с весом n" + box.getWeight());

       // hb1.andThen(hb2).accept(box);


    }
}
//    Написать лямбда выражение, которое принимает на вход объект типа
//    HeavyBox и выводит на консоль сообщение “Отгрузили ящик с весом n”.
//    “Отправляем ящик с весом n” Используем функциональный интерфейс Consumer и
//    метод по умолчанию andThen.