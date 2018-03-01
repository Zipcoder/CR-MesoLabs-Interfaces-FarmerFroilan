package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.crop.CropRow;
import com.zipcodewilmington.froilansfarm.crop.Field;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

public class CropDuster extends AirCraft implements FarmVehicle{
    private boolean hasRider = false;
    private boolean isFlying = false;

    public void operate(Field field) {
        if (hasRider && isFlying) {
            for (CropRow cropRow : field.getCropRowsInField()) {
                for (Crop crop : cropRow.getCropsInRow()) {
                    crop.setHasBeenFertilized(true);
                    crop.setHasBeenHarvested(false);
                }
            }
        }
    }

    public void fly() {
        if (hasRider){
            this.isFlying = true;
        }
    }

    public void land() {
        if(isFlying){
            this.isFlying = false;
        }
    }

    public String makeNoise() {
        return "Whoosh!";
    }

    public void ride() {
        this.hasRider = true;

    }

    public void stopRiding() {
        if (!isFlying){
            this.hasRider = false;
        }
    }

    public boolean getHasRider(){
        return this.hasRider;
    }

    public boolean getIsFlying(){
        return this.isFlying;
    }
}
