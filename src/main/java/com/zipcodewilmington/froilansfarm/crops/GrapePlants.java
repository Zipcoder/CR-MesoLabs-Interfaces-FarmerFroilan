package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.interfaces.Produces;

public class GrapePlants implements Produces {

    private Boolean hasBeenFertilized;

    public GrapePlants(){
        this.hasBeenFertilized = false;
    }

    // should return type "Edible"
    public void yield(){
        if(hasBeenFertilized){
            return;//return "Edible" parameter
        }
    }

    //getter and setter
    public Boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(Boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }
}
