package com.zipcodewilmington.froilansfarm.Vehicles;

public abstract class AirCraft extends Vehicle {

    public boolean inTheAir = false;

    @Override
    public String makeNoise() {
        return "Brrrrrrr";
    }

    public void takeOff() {
        inTheAir = true;
    }

    public void land() {
        inTheAir = false;
    }

}
