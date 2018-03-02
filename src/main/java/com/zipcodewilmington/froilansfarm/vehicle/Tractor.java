package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.crop.CropRow;
import com.zipcodewilmington.froilansfarm.crop.Field;
import com.zipcodewilmington.froilansfarm.farm.Silo;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

import java.util.ArrayList;

public class Tractor extends Vehicle implements FarmVehicle {

    private final ArrayList<Edible> tractorCropStorage = new ArrayList<Edible>();

    public void operate(Field field) {
        if (hasRider) {
            for (CropRow cropRow : field.getCropRowsInField()) {
                for (Crop crop : cropRow.getCropsInRow()) {
                        this.tractorCropStorage.add(crop.yield());
                }
            }
        }
    }

    public void depositHarvest(Silo silo){
        silo.storeFood(this.tractorCropStorage);
        this.tractorCropStorage.clear();
    }

    public ArrayList<Edible> getTractorCropStorage() {
        return this.tractorCropStorage;
    }

    public String makeNoise() {
        return "Vrrrrrr";
    }


    public void stopRiding(){
        this.hasRider = false;
    }

}
