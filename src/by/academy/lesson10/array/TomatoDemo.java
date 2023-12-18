package by.academy.lesson10.array;

public class TomatoDemo {

    public static void main(String[] args) {
        Container c = new Container();

        c.add(new Tomato("One", 5));
        c.add(new Tomato("Two", 4));
        c.add(new Tomato("Three", 3));
        c.add(new Tomato("Four", 2));
        c.add(new Tomato("Five", 1));


        c.delete(0);
        c.print();


    }
}
