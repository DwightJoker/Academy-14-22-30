package by.academy.lesson11.ind.aircraft;

public class Douglas26 extends Aircraft{

    private final int seats;

    public Douglas26(String brand, String model, int flightRange, int fuelConsumption, int seats) {
        super(brand, model, flightRange, fuelConsumption);
        this.seats = seats;
    }
}
