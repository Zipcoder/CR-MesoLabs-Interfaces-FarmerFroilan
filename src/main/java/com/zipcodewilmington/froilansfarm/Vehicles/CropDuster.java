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
            for (int i = 0; i < field.getEntireCropRow().size(); i++){
                field.getCropRow(i).getCrops().setHasBeenFertilized(true);
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
