package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Field.Crop;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class Tractor extends Vehicle implements FarmVehicle {


    public void operate() {

    }

    public void harvestCrop(Crop crop){

    }

    public void riding() {
        this.hasFarmerRiding = true;
    }

    public void endRiding() {
        this.hasFarmerRiding = false;
    }

    public String makeNoise() {
        return "Rumble";
    }
}
