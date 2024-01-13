package by.academy.homeworks.homework4.task2;

public class BodyDemo {

    public static void main(String[] args) {
        Body.Heart h1 = new Body.Heart();
        h1.live();
        Body.Lungs l1 = new Body.Lungs();
        l1.live();
        Body b1 = new Body();
        b1.live();

    }
}
