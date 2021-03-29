package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.edible.Tomato;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class TomatoPlant extends Crop{

    public TomatoPlant(){

    }

    //IF isFertilized is true and isHarvested is false -> DONE
    //Then return a Tomato, and set isHarvested to true -> DONE
    //caller will need to store returned food object some place
    public Edible yield() {
        if(isFertilized() && !isHarvested()){
            harvestCrop();
            return new Tomato();
        }
        else{
            return null;
        }
    }

    @Override
    public String toString(){
        return "Tomato Plant";
    }
}
