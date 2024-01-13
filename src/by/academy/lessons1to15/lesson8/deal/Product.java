package by.academy.lessons1to15.lesson8.deal;

import java.util.Objects;

public class Product {
    protected String name;
    protected double price;
    protected double quantity;


    public Product(String name, double price, double quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getQuantity(double quantity) {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice(double price) {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculatePrice() {
        return quantity * price * discount();
    }

    public double discount() {
        if (quantity < 10){
            return 1;
        } else if (quantity < 20) {
            return 0.8;
        } else {
            return 0.75;
        }
    }
    //public abstract double discount();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Double.compare(product.quantity, quantity) == 0 && Objects.equals(getName(), product.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), price, quantity);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

