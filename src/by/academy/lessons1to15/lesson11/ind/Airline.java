package by.academy.lessons1to15.lesson11.ind;

import by.academy.lessons1to15.lesson11.ind.aircraft.Aircraft;


public class Airline {

    private String airlineName;
    public Aircraft[] aircrafts;
    private int current;

    public void increaseAircraftQuantity() {
        Aircraft[] newAircraft = new Aircraft[aircrafts.length * 2 + 1];
        System.arraycopy(aircrafts, 0, newAircraft, 0, aircrafts.length);
        aircrafts = newAircraft;
    }

    public void add(Aircraft aircraftes){
        if (aircrafts == null) {
            aircrafts = new Aircraft[10];
            current = 0;
        }
        if (current >= aircrafts.length) {
            increaseAircraftQuantity();
        }
        aircrafts[current++] = aircraftes;
    }

//    public void sortPlanesByRange() {
//            for (int i = 0; i < aircrafts.length - 1; i++) {
//                for(int j = 0; j < aircrafts.length - i - 1; j++) {
//                    if(aircrafts[j + 1] < aircrafts[j]) {
//                        int swap = aircrafts[j];
//                        aircrafts[j] = aircrafts[j + 1];
//                        aircrafts[j + 1] = swap;
//                    }
//                }
//            }
//    }




}

