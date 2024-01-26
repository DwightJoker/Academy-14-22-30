package by.academy.homeworks.homework3.products;

import by.academy.lessons1to15.lesson14.Producer;

@Producer(startYear = 1, producerCountry = " ", producerFullName = " ")
public class Boat extends Product {

    private String manufacturer;
    private String speed;

    public Boat(String category, double price, double quantity, String manufacturer, String speed) {
        super(category, price, quantity);
        this.manufacturer = manufacturer;
        this.speed = speed;
    }

    public Boat(String manufacturer, String speed) {
        this.manufacturer = manufacturer;
        this.speed = speed;
    }

    @Override
    public double discount() {

        if (super.getQuantity() < 2) {
            return 1;
        } else if (super.getQuantity() < 5) {
            return 0.8;
        } else {
            return 0.75;
        }
    }

    @Override
    public String toString() {
        return "Тип товара: " + category + " " + "Производитель " + manufacturer + " " + "Цена " + price + " " + "Количество " + quantity + " " + "Скорость " + speed;
    }

}