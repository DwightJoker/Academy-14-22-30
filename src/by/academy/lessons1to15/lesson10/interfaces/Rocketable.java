package by.academy.lessons1to15.lesson10.interfaces;

public interface Rocketable extends Flyable {

    void rocket();

    default void startEngine() {
        System.out.println("Rocket vehicle launched!");
    }
}
