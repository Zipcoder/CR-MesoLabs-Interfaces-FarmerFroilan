package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.edibles.Potatos;
import com.zipcodewilmington.froilansfarm.interfaces.Produces;

public class PotatoPlants implements Produces {

    private Boolean hasBeenFertilized;

    public PotatoPlants(){
        this.hasBeenFertilized = false;
    }

    public Edibles yield(){
        if(hasBeenFertilized){
            Potatos potatos = new Potatos();
            return potatos;
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
