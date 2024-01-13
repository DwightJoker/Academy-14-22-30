package by.academy.lessons1to15.lesson8.demo;

import by.academy.lessons1to15.lesson8.deal.Product;

public class Oil extends Product {

    private double viscosity;

    public Oil(String name, double price, double quantity) {
        super(name, price, quantity);

    }

    public Oil(String name, double price, double quantity, double viscosity) {
        super(name, price, quantity);
        this.viscosity = viscosity;

    }

    public void setViscosity(double viscosity) {
        this.viscosity = viscosity;
    }

    public double getViscosity() {
        return viscosity;
    }
}
