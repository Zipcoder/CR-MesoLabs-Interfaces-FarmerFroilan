package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.plants.CropRow;

import com.zipcodewilmington.froilansfarm.plants.Field;

public class Tractor extends FarmVehicle{

    CropRow cropRow = new CropRow();

    @Override
     public boolean operate(Field field) {
        if (isMounted()){
            //do the planting
            return true;
        }
        return false;
    }

    @Override
    public String makeNoise() {
        return "I'm a tractor!";
    }

    @Override
    public boolean isMounted() {
        return false;
    }
}
