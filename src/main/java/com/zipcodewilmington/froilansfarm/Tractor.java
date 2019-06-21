package com.zipcodewilmington.froilansfarm;

import java.util.List;

public class Tractor implements Vehicle, FarmVehicle, Driveable,Rideable,NoiseMaker {

    public boolean isFarmVehicle() {
        return true;
    }

    public boolean operate() {
        return true;
    }

    public boolean isDriveable() {
        return true;
    }

    public boolean vehicleRideable() {
        return true;
    }
    public Crops harvested(CropRow cropRow){
        return null;//croprow amount of crop  takes croprow.crop-harvest crop. crops return
    }

    public boolean makesNoise() {
        return true;
    }

    public List<Tomato> harvest(TomatoPlant tomatoPlant){
        Tomatoes harvestedtomatoes = new Tomatoes();
        return (List<Tomato>) harvestedtomatoes;
    }
}
