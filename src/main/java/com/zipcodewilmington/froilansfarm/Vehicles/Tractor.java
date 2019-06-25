package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Animal.*;


import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.Produce.*;

public class Tractor implements FarmVehicle, NoiseMaker ,Driveable{
    Crops crops;

    public boolean harvested(CropRow cropRow) {
        crops.getHarvested();
        return true;
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


    @Override
    public boolean isDriver(  Rider rider) {

        if(rider instanceof Driver)
        return true;
        else
            return false;
    }


}
