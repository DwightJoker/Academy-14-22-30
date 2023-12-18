package by.academy.lesson9.shapes;

import java.util.Objects;

public class Circle extends Shape{

    private int x;
    private int y;

    public Circle() {
        super();
    }

    public Circle(String color) {
        super(color);
    }

    public Circle(String color, int x, int y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String draw() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return getX() == circle.getX() && getY() == circle.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
