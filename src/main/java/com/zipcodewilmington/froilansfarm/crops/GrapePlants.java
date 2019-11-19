package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.edibles.Grapes;
import com.zipcodewilmington.froilansfarm.interfaces.Produces;

public class GrapePlants implements Produces {

    private Boolean hasBeenFertilized;

    public GrapePlants(){
        this.hasBeenFertilized = false;
    }

    public Edibles yield(){
        if(hasBeenFertilized){
            Grapes grapes = new Grapes();
            return grapes;
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
