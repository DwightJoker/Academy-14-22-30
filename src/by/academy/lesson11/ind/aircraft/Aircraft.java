package by.academy.lesson11.ind.aircraft;

import by.academy.lesson11.ind.Airline;

public abstract class Aircraft extends Airline {

    private final String brand;
    private final String model;
    private final int flightRange;
    private final int fuelConsumption;


    public Aircraft(String brand, String model, int flightRange, int fuelConsumption) {
        this.brand = brand;
        this.model = model;
        this.flightRange = flightRange;
        this.fuelConsumption = fuelConsumption;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getFlightRange() {
        return flightRange;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }
    public int calculatePowerRevers(){
        return flightRange / fuelConsumption;
    }


}
