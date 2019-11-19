package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Corn;
import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.interfaces.Produces;

public class CornStalk implements Produces {

    private Boolean hasBeenFertilized;

    public CornStalk(){
        this.hasBeenFertilized = false;
    }

    public Edibles yield(){
        if(hasBeenFertilized){
            Corn corn = new Corn();
            return corn;
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
