package by.academy.homeworks.homework3.products;

import java.util.Objects;


public abstract class Product {
    String category;
    double price;
    double quantity;

    public Product(String category, double price, double quantity) {
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {
        super();
    }

    public String getName() {
        return category;
    }

    public void setName(String name) {
        this.category = category;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double calculatePriceWithDiscount() {
        return quantity * price * discount();
    }

    public abstract double discount();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.getPrice(), getPrice()) == 0 && Double.compare(product.getQuantity(), getQuantity()) == 0 && Objects.equals(category, product.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, getPrice(), getQuantity());
    }

    @Override
    public String toString() {
        return "Тип товара: " + category + " " + "Цена " + price + " " + "Количество " + quantity;
    }
}