package com.zipcodewilmington.froilansfarm.farm.things.vehicles;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.field.CropRow;

public class Tractor extends Vehicle implements FarmVehicle {

    public Tractor(String name) {
        super(name);
    }

    public void operate(Farm homeFarm) {
        homeFarm.addVehicle(this);

    }


    public void shutDown(Farm homeFarm) {
        homeFarm.removeVehicle(this);
    }


    public void fertilize(CropRow targetRow) {
        for(Crop c : targetRow.getAllCrops()){
            c.fertilize();
        }
    }


    public String makeNoise() {
        return "baRUMPBUMPbumpbumpBUMPBUMP!!!";
    }

    public void harvestCrop (CropRow targetRow){
        for(Crop c : targetRow.getAllCrops()){
            c.harvest();
        }

    }

}
