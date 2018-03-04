package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.FarmBuildings.Field;
import com.zipcodewilmington.froilansfarm.FarmBuildings.Refrigerator;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

import java.util.ArrayList;

public class Tractor extends Vehicle implements FarmVehicle {
    public ArrayList<Edible> getHarvestedFood() {
        return harvestedFood;
    }

    public ArrayList<Edible> harvestedFood = new ArrayList<>();

    public String makeNoise() {
        return "Chuga chuga";
    }

    public void canRide() {
        this.hasRider = true;
    }

    public void stopRide() {
        this.hasRider = false;
    }
    public void operate(Field field) {
        if (hasRider) {
            for (int i = 0; i < field.getEntireCropRow().size(); i++) {
                field.getCropRow(i).getCrops().setHasBeenHarvested(true);
                harvestedFood.add(field.getCropRow(i).getCrops().yield());
            }
        }
    }
    public void processHarvest(Refrigerator refrigerator){
        refrigerator.freezeFood(harvestedFood);
    }


}
