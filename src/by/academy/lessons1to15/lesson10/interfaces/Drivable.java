package by.academy.lessons1to15.lesson10.interfaces;
public interface Drivable {
    void drive();

    void test();

    default void startEngine() {
        System.out.println("Drivable vehicle launched!");
    }

    default void turnLeft() {
        System.out.println("Turn left!");
    }

    default void turnRight() {
        System.out.println("Turn right!");
    }

    private void privateFunctionality() {
        System.out.println();
    }
}
