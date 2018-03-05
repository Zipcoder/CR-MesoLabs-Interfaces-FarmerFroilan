package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Exceptions.NoDriverException;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.FoodStore;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

import java.util.List;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/1/18
 */
public class Tractor extends Vehicle implements FarmVehicle, Rideable {
    private FoodStore targetStore;

    public Tractor(FoodStore targetStore) {
        super();
        this.targetStore = targetStore;
    }

    public void operate(Farm farm) throws NoDriverException {
        confirmDriver();
        List<CropRow> cropRows = farm.getField().getCropRows();
        for (CropRow row : cropRows) {
            for (Crop crop : row.getCrops())
                targetStore.storeFood(harvest(crop));
        }
    }

    public void makeNoise() {
        // tractor noise
    }

    public Edible harvest(Crop crop) {
        return crop.yield();
    }

    public FoodStore collectHarvest() {
        return targetStore;
    }
}
