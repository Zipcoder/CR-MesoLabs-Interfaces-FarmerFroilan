package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Potatos;
import com.zipcodewilmington.froilansfarm.interfaces.Produces;

import java.util.Arrays;

public class PotatoPlants implements Produces {

    private Boolean hasBeenFertilized;

    public PotatoPlants(){
        this.hasBeenFertilized = false;
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
