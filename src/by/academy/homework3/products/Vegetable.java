package by.academy.homework3.products;

public class Vegetable extends Product{


    private String name;
    private int quantity;
    private int price = 100;

    public Vegetable(String name, int quantity) {
        super();
        this.name = name;
        this.quantity = quantity;
    }

    public double fullProductPrice() {
        return price * quantity * discount();

    }

    @Override
    public double discount() {

        if (quantity < 20){
            return 1;
        } else if (quantity < 40) {
            return 0.8;
        } else {
            return 0.75;
        }
    }
}
