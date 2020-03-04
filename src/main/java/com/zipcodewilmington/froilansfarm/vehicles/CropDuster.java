package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.farmland.CropRow;
import com.zipcodewilmington.froilansfarm.farmland.Field;

import java.util.ArrayList;

public class CropDuster extends Vehicle implements FarmVehicle, Aircraft {
    boolean isFlying = false;

    public CropDuster() {
    }

    public String makeNoise() {
        return "putt putt putt putt";
    }

    public boolean fly() {
        if(!this.isFlying){
            this.isFlying = true;
            return true;
        } else this.isFlying = false;
        return false;
    }



    public boolean operate(Field field) {
        return false;
    }
}
