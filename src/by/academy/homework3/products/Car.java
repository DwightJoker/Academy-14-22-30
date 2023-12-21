package by.academy.homework3.products;

public class Car extends Product {

    private String brand;
    private double engine;

    public Car(String category, double price, double quantity, String brand, double engine) {
        super(category, price, quantity);
        this.brand = brand;
        this.engine = engine;
    }

    public Car() {
    }

    @Override
    public double discount() {

        if (super.getQuantity() < 5) {
            return 1;
        } else if (super.getQuantity() < 7) {
            return 0.8;
        } else {
            return 0.75;
        }
    }

    @Override
    public String toString() {
        return "Тип товара: " + category + " " + "Производитель " + brand + " " + "Цена " + price + " " + "Количество " + quantity + " " + "Объем двигателя " + engine;
    }
}