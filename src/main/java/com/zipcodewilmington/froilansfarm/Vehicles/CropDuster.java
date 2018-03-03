package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.FarmBuildings.Field;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class CropDuster extends Aircraft implements FarmVehicle {

    public String makeNoise(){
        return "Whoosh!";
    }

    public void operate(Field field) {
        if (isFlying && hasRider){
            for (CropRow cropRows : field.getCropRow()){
//                for (Crop crops; cropRows.getCropRow()){
//                    crops.setHasBeenFertilized();
//                }
            }
        }
    }

    public void canRide() {
        this.hasRider = true;
    }

    public void stopRide() {
        if(!isFlying){
            this.hasRider = false;
        }
    }
}
