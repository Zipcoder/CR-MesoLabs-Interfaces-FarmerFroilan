package com.zipcodewilmington.froilansfarm.Vehicles;



import com.zipcodewilmington.froilansfarm.Animal.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Crops;

public class CropDuster implements FarmVehicle, Vehicle, NoiseMaker, Flyable {
    public boolean isFarmVehicle() {
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

