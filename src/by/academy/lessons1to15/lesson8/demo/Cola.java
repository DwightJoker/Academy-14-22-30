package by.academy.lessons1to15.lesson8.demo;

import by.academy.lessons1to15.lesson8.deal.Product;

public class Cola extends Product {

    private String sugar;

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
