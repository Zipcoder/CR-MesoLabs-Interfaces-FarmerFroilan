package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.edibles.Watermelon;
import com.zipcodewilmington.froilansfarm.interfaces.Produces;

import java.util.ArrayList;
import java.util.List;

public class WatermelonPlants implements Produces {

    private Boolean hasBeenFertilized;

    public WatermelonPlants(){
        this.hasBeenFertilized = false;
    }

    public List<Watermelon> yield(){
        if(hasBeenFertilized){

            List<Watermelon> yieldGroup = new ArrayList<Watermelon>();
            int yieldAmount = (int)(Math.random() * ((4 - 2) + 2)) + 1;

            for(int i = 0; i < yieldAmount; i++){
                Watermelon watermelon = new Watermelon();
                yieldGroup.add(watermelon);
            }
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
