package by.academy.lessons1to15.lesson9;

public class Cat extends Animal{

    int weight;
    String family;

    public Cat(String name, String type, int weight, String family) {
        super(name, type);
        this.weight = weight;
        this.family = family;
        System.out.println("Cat");
    }

    public Cat() {
        super();
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
