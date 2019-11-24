package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Watermelon;
import com.zipcodewilmington.froilansfarm.interfaces.Produces;

import java.util.Arrays;

public class WatermelonPlants extends Crop implements Produces {

    Boolean hasBeenFertilized;

    public WatermelonPlants(){
        super();
    }

    public Watermelon[] yield(){
        if(hasBeenFertilized){
            int yieldAmount = (int)(Math.random() * ((4 - 2) + 1)) + 2;
            Watermelon[] yieldGroup = new Watermelon[yieldAmount];
            Arrays.fill(yieldGroup, new Watermelon());
            return yieldGroup;
        }
        return null;
    }

    //getter and setter
    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }
}
