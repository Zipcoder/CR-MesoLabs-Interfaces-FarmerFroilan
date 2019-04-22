package com.zipcodewilmington.froilansfarm.farm.things.vehicles;

import com.zipcodewilmington.froilansfarm.farm.field.CropRow;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.Crop;

public class CropDuster extends Vehicle implements FarmVehicle,Aircraft {
    private boolean flying;
    private boolean operating;

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
        homeFarm.addVehicle(this);

    }

    public void shutDown(Farm homeFarm) {
        homeFarm.removeVehicle(this);

    }

    public String makeNoise() {

        return "mmmmmmmrrrrRRRRRROOOOOOOWWWWWWwwwwwww!!!";
    }

    public void fertilize (CropRow targetRow){
        for(Crop c : targetRow.getAllCrops()){
            c.fertilize();
        }

    }


}
