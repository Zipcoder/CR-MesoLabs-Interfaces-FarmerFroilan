package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.edibles.Tomatos;
import com.zipcodewilmington.froilansfarm.interfaces.Produces;

public class TomatoPlants implements Produces {

    private Boolean hasBeenFertilized;

    public TomatoPlants(){
        this.hasBeenFertilized = false;
    }

    public Edibles yield(){
        if(hasBeenFertilized){
            Tomatos tomatos = new Tomatos();
            return tomatos;
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
