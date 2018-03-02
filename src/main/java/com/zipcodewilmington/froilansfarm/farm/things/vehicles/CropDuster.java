package com.zipcodewilmington.froilansfarm.farm.things.vehicles;

import com.zipcodewilmington.froilansfarm.farm.field.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Farm;

public class CropDuster extends Vehicle implements FarmVehicle,Aircraft {
    private boolean flying;

    public CropDuster(String name) {
        super(name);
    }

    public void fly() {
        if(this.isBeingRidden()) {
            this.flying = true;
        }

    }

    public void land(){
        if(this.isBeingRidden()) {
            this.flying = false;
        }

    }

    public boolean isFlying(){
        return this.flying;
    }

    public void operate(Farm homeFarm) {

    }

    public String makeNoise() {
        return null;
    }

    public void fertilize (CropRow targetRow){

    }


}
