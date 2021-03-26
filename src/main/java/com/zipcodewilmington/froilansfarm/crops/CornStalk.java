package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.edible.Tomato;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class CornStalk extends Crop{
    boolean isFertilized = false;
    boolean isHarvested = false;

    public CornStalk(){

    }

    public Edible yield() {
        if(isFertilized){
            return new Corn();
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
