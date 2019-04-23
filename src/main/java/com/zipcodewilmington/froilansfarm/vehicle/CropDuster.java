package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.crop.CropRow;
import com.zipcodewilmington.froilansfarm.crop.Field;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

public class CropDuster extends AirCraft implements FarmVehicle{

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


    public String makeNoise() {
        return "Whoosh!";
    }


    public void stopRiding() {
        if (!isFlying){
            this.hasRider = false;
        }
    }

    public boolean getIsFlying(){
        return this.isFlying;
    }
}
