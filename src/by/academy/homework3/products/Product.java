package by.academy.homework3.products;

public abstract class Product {
    private String category;
    private String name;
    private double price;
    private double quantity;


    public Product(String category, String name, double price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }


    public Product() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
//    {
//        if (quantity < 10){
//            return 1;
//        } else if (quantity < 20) {
//            return 0.8;
//        } else {
//            return 0.75;
//        }
//    }

}
