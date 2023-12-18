package by.academy.homework3.products;

public class Boat extends Product{


    private String Brand;


    public Boat(String category, String name, double price, String brand) {
        super(category, name, price);
        Brand = brand;
    }

    @Override
        public double discount() {

            if (super.getQuantity() < 10){
                return 1;
            } else if (super.getQuantity() < 20) {
                return 0.8;
            } else {
                return 0.75;
            }
        }
    }

