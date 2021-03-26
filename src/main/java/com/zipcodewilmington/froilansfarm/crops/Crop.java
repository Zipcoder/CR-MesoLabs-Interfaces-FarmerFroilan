package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public abstract class Crop implements Produce {
    boolean isFertilized = false;
    boolean isHarvested = false;

    public Crop(){

    }

    public void isFertilized() {
        isFertilized = true;
    }

    public void isHarvested(){
        if(isFertilized && !isHarvested){
            Edible ediblePlant = this.yield();

        }

    }


}
