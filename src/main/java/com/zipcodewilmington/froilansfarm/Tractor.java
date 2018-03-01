package com.zipcodewilmington.froilansfarm;

public class Tractor extends FarmVehicle{

    // can fertilize one crop at a time
    public void fertilize(Crop crop) {

    }

    @Override
    public String makeNoise() {
        return "Wuhchchch";
    }

}
