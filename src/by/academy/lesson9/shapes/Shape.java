package by.academy.lesson9.shapes;

public abstract class Shape {

    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public Shape() {
        super();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract String draw();



}
