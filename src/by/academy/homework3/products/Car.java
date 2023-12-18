package by.academy.homework3.products;

public class Car extends Product{


    private String Brand;

    public Car(String category, String name, double price, String brand) {
        super(category, name, price);
        Brand = brand;
    }

    public Car() {
    }

    @Override
    public double discount() {

        if (super.getQuantity() < 2){
            return 1;
        } else if (super.getQuantity() < 5) {
            return 0.8;
        } else {
            return 0.75;
        }
    }
}

//    switch (scanner produktov) {
//        case cucumber: cart.add(new Car());
//            break;
//        case audi:
//            break;
//        case boat:
//            break;
//        default:
//            break;
//    }
