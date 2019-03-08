package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.Field;
import com.zipcodewilmington.froilansfarm.Edible.Edible;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

import java.util.ArrayList;

public class Farmer extends Person implements Rider, Botanist {

    private Farm farm;
    private Rideable currentRide;

    public Farmer(String name){
        super(name);
        this.farm = null;
    }

    public Farmer(String name, Farm farm){
        super(name);
        this.farm = farm;
    }

    public String makeNoise() {
        return "Howdy";
    }

    public void eat(Edible edible) {
        this.calories += edible.calories;
    }

    public void eat(Edible... edibles){
        for (Edible edible:edibles) {
            this.eat(edible);
        }
    }

    public void mount(Rideable rideable){
        this.currentRide = rideable;
        rideable.setRider(this);
    }

    public void dismount(){
        this.currentRide = null;
    }

    public Rideable getRide(){
        return this.currentRide;
    }

    public void fertilize(){
        ArrayList<CropRow> rowsList = farm.getField().getRowsList();
        for (CropRow cropRow:rowsList) {
            fertilize(cropRow.getCrops());
        }
    }

    public void fertilize(Crop crop){
        crop.isFertilized = true;
    }
}
