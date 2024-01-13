package by.academy.lessons1to15.lesson11.ind.aircraft;

public class Hercules130 extends Aircraft {
    private final int cargo;


    public Hercules130(String brand, String model, int flightRange, int fuelConsumption, int cargo) {
        super(brand, model, flightRange, fuelConsumption);
        this.cargo = cargo;
    }

}

