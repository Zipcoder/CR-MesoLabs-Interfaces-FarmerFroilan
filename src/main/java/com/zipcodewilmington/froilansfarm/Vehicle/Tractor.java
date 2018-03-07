package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Field.Crop;
import com.zipcodewilmington.froilansfarm.Field.Field;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class Tractor extends Vehicle implements FarmVehicle {


    public void operate(Field field) {

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
