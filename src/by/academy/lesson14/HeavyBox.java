package by.academy.lesson14;

import java.util.ArrayList;

public class HeavyBox {

        double height;
        double width;
        double depth;
        double weight;

    public HeavyBox(double height, double width, double depth, double weight) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                ", weight=" + weight +
                '}';
    }

    //    public void printBox() {
//        for () {
//        }
//    }


}
