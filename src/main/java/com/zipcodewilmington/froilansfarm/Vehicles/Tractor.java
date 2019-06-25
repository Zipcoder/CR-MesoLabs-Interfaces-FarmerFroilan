package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Animal.Driver;
import com.zipcodewilmington.froilansfarm.Animal.Farmer;
import com.zipcodewilmington.froilansfarm.Animal.NoiseMaker;


import com.zipcodewilmington.froilansfarm.Animal.Rider;
import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.Produce.*;

public class Tractor implements FarmVehicle, NoiseMaker {
    Crops crops;

    public boolean harvested(CropRow cropRow) {
        crops.getHarvested();
        return true;
    }


    public Edible harvest(Crops crops){
        Edible harvest= (Edible) crops.yield();
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
