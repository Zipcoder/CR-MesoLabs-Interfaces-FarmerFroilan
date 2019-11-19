package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.edibles.Watermelon;
import com.zipcodewilmington.froilansfarm.interfaces.Produces;

public class WatermelonPlants implements Produces {

    private Boolean hasBeenFertilized;

    public WatermelonPlants(){
        this.hasBeenFertilized = false;
    }

    public Edibles yield(){
        if(hasBeenFertilized){
            Watermelon watermelon = new Watermelon();
            return watermelon;
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
