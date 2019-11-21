package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.edibles.Watermelon;
import com.zipcodewilmington.froilansfarm.interfaces.Produces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WatermelonPlants implements Produces {

    private Boolean hasBeenFertilized;

    public WatermelonPlants(){
        this.hasBeenFertilized = false;
    }

    public Watermelon[] yield(){
        if(hasBeenFertilized){
            int yieldAmount = (int)(Math.random() * ((4 - 2) + 2)) + 1;
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
