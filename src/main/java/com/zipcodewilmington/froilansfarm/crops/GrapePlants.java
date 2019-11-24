package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Grapes;
import com.zipcodewilmington.froilansfarm.interfaces.Produces;

import java.util.Arrays;

public class GrapePlants extends Crop implements Produces {

    Boolean hasBeenFertilized;

    public GrapePlants(){
        super();
    }

    public Grapes[] yield(){
        if(this.hasBeenFertilized){
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
