package by.academy.lessons1to15.lesson8.classsss;

public class ColorBox extends Box {

    private String color;

    public ColorBox() {
        super();
    }
    public ColorBox(double width, double depth, double height) {
        super(height, width, depth);
    }
    public ColorBox(double width, double depth, double height, String color) {
        super(height, width, depth);
        this.color = color;
    }

}
