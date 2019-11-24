package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Potatos;

import java.util.Arrays;

public class PotatoPlants extends Crop {

    Boolean hasBeenFertilized;

    public PotatoPlants(){
        super();
    }

    public Potatos[] yield(){
        if(hasBeenFertilized){
            int yieldAmount = (int)(Math.random() * ((10 - 5) + 1)) + 5;
            Potatos[] yieldGroup = new Potatos[yieldAmount];
            Arrays.fill(yieldGroup, new Potatos());
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
