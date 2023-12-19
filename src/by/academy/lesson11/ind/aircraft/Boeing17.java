package by.academy.lesson11.ind.aircraft;

public class Boeing17 extends Aircraft{

    private final int seats;
    private final int cargo;

    public Boeing17(String brand, String model, int flightRange, int fuelConsumption, int seats, int cargo) {
        super(brand, model, flightRange, fuelConsumption);
        this.seats = seats;
        this.cargo = cargo;
    }
}
