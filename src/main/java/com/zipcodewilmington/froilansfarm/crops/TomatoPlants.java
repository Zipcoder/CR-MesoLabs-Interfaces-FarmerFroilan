package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Tomatos;
import com.zipcodewilmington.froilansfarm.interfaces.Produces;

import java.util.Arrays;

public class TomatoPlants implements Produces {

    private Boolean hasBeenFertilized;

    public TomatoPlants(){
        this.hasBeenFertilized = false;
    }

    public Tomatos[] yield(){
        if(hasBeenFertilized){
            int yieldAmount = (int)(Math.random() * ((5 - 4) + 1)) + 4;
            Tomatos[] yieldGroup = new Tomatos[yieldAmount];
            Arrays.fill(yieldGroup, new Tomatos());
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
