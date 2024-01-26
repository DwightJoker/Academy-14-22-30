package by.academy.lessons1to15.lesson14;

public class HeavyBox {

        double height;
        double width;
        double depth;
        double weight;
        String name;


    public HeavyBox(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
