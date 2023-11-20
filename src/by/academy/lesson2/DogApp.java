package by.academy.lesson2;

public class DogApp {
    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.setNickname("Rex");
        rex.setColor("Grey");
        rex.setAge(5);
        System.out.println(rex);

        Dog bars = new Dog("Bars");
        System.out.println(bars);

        Dog fray = new Dog("Fray", 25, "grey");
        System.out.println(fray);

        rex.eat();
        bars.sleep();
        fray.serve();



    }

}
