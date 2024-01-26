package by.academy.homeworks.homework3.products;

import by.academy.lessons1to15.lesson14.Producer;

@Producer(startYear = 1, producerCountry = " ", producerFullName = " ")
public class Vegetable extends Product {

    private String name;
    private String color;

    public Vegetable(String category, double price, double quantity, String name, String color) {
        super(category, price, quantity);
        this.name = name;
        this.color = color;
    }

    public Vegetable(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public double discount() {

        if (getQuantity() < 20) {
            return 1;
        } else if (getQuantity() < 40) {
            return 0.8;
        } else {
            return 0.75;
        }
    }

    @Override
    public String toString() {
        return "Тип товара: " + category + " " + "Наименование " + name + " " + "Цена " + price + " " + "Количество " + quantity + " " + "Цвет " + color;

    }
}