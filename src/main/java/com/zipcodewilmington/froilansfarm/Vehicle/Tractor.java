package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Field.Crop;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class Tractor extends Vehicle implements FarmVehicle {

    public void operate() {

    }

    public void harvest(Crop crop, CropRow CropRow) {

    }

    public String makeNoise() {
        return "Tractor Sounds";
    }

}
