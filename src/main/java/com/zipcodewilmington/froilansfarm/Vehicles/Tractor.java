package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Animal.Driver;
import com.zipcodewilmington.froilansfarm.Animal.Farmer;
import com.zipcodewilmington.froilansfarm.Animal.NoiseMaker;


import com.zipcodewilmington.froilansfarm.Animal.Rider;
import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.Produce.*;

public class Tractor implements FarmVehicle, NoiseMaker {
    Crops crops;
    Farmer farmer;
    public boolean harvested(CropRow cropRow) {
        crops.getHarvested();
        return true;
    }


    public void operate() {

    }

    public boolean isDriveable() {
        return true;
    }

    public boolean vehicleRideable() {
        return true;
    }

    public boolean makesNoise() {
        return true;
    }

    public Tomatoes harvest(TomatoPlant tomatoPlant) {
        Tomatoes harvestedtomatoes = new Tomatoes();
        return harvestedtomatoes;
    }

    public Edible harvest(Crops crops){
        Edible harvest = (Edible) crops.yield();
        return  harvest;

    }

    public String makeNoise() {
        return "trtrtrrr";
    }

    public Vehicle operate(Rider rider) {
        if(rider instanceof Driver)
            return (Vehicle) this;
        else
            return null;

    }
}
