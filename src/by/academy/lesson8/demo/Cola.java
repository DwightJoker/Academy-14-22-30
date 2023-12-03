package by.academy.lesson8.demo;

import by.academy.lesson8.deal.Product;

public class Cola extends Product {

    String sugar;

    public Cola(String name, double price, double quantity) {
        super(name, price, quantity);

    }

    public Cola(String name, double price, double quantity, String sugar) {
        super(name, price, quantity);
        this.sugar = sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public String getSugar() {
        return sugar;
    }
}
