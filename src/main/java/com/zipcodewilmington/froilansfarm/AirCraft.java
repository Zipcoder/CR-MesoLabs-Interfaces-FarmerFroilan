package com.zipcodewilmington.froilansfarm;

public class AirCraft extends FarmVehicle {

    boolean inTheAir = false;

    public void takeOff() {
        inTheAir = true;
    }

    public void land() {
        inTheAir = false;
    }

}
