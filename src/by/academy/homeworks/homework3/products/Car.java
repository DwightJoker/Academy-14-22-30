package by.academy.homeworks.homework3.products;

import by.academy.lessons1to15.lesson14.Producer;

@Producer(startYear = 0, producerCountry = " ", producerFullName = " ")
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