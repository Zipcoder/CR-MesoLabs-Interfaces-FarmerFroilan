package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edible.Tomato;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class TomatoPlant extends Crop{
    boolean isFertilized = false;
    boolean isHarvested = false;

    public TomatoPlant(){

    }


    public Edible yield() {
        if(isFertilized){
            return new Tomato();
        }
        return null;
    }

    public void isFertilized() {
        isFertilized = true;
    }

    public void isHarvested(){
        isHarvested = true;
    }
}
