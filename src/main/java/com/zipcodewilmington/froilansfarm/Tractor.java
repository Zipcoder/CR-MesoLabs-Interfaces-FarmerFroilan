package com.zipcodewilmington.froilansfarm;

public class Tractor extends FarmVehicle{

    // can fertilize one crop at a time
    public void fertilize(Crop crop) {
        crop.fertilize();
    }

    @Override
    public String makeNoise() {
        return "Awooga";
    }

}
