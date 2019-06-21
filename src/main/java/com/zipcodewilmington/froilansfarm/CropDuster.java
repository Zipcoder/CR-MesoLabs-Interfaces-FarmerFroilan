package com.zipcodewilmington.froilansfarm;

public class CropDuster implements FarmVehicle,Vehicle,NoiseMaker,Driveable,Flyable {
    public boolean isFarmVehicle() {
        return true;
    }

    public boolean isDriveable() {
        return true;
    }
    public boolean canFly() {
        return true;
    }

    public boolean makesNoise() {
        return true;
    }

    public boolean operate() {
        return true;
    }
    public Crops fertilize(CropRow cropRow){
        return null;//croprow method is fetilized true
    }
}
