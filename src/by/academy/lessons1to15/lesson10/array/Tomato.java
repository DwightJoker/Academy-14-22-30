package by.academy.lessons1to15.lesson10.array;

public class Tomato {

    private String name;
    private int quantity;

    public Tomato(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Tomato" + name + '\n' + quantity;
    }
}
