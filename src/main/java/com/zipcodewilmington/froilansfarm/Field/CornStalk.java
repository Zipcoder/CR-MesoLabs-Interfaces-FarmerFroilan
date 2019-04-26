package com.zipcodewilmington.froilansfarm.Field;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class CornStalk extends Crop {

    public EarCorn yields(){
        if(!this.getHasBeenHarvested() && this.getHasBeenFertilized()){
            return new EarCorn();
        }
        return null;
    }

}
