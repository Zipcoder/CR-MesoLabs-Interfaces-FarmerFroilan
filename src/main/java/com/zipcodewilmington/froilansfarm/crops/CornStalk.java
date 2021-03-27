package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.edible.Tomato;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class CornStalk extends Crop{

    public CornStalk(){

    }

    //IF isFertilized is true and isHarvested is false
    //Then return a Corn, and set isHarvested to true
    //caller will need to store returned food object some place
    public Edible yield() {
        return new Corn();
    }

    @Override
    public String toString(){
        return "Corn Stalk";
    }
}
