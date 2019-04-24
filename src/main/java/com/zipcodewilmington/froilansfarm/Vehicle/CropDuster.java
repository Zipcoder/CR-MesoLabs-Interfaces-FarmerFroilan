package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class CropDuster extends Aircraft implements FarmVehicle {

    public void operate() {

    }

    public void fertilize() {

    }

    @Override
    public String makeNoise() {
        return "BBRRRRRRRRRTTTTTTTTTTTTTTTTTT";
    }
}
