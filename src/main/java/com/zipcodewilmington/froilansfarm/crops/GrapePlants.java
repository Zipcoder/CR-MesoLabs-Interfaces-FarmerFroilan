package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.edibles.Grapes;
import com.zipcodewilmington.froilansfarm.interfaces.Produces;

import java.util.Arrays;

public class GrapePlants implements Produces {

    private Boolean hasBeenFertilized;

    public GrapePlants(){
        this.hasBeenFertilized = false;
    }

    public Grapes[] yield(){
        if(hasBeenFertilized){
            int yieldAmount = (int)(Math.random() * ((30 - 20) + 1)) + 20;
            Grapes[] yieldGroup = new Grapes[yieldAmount];
            Arrays.fill(yieldGroup, new Grapes());
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
