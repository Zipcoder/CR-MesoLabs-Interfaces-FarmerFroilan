package com.zipcodewilmington.froilansfarm.Field;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.util.ArrayList;

public class TomatoPlant extends Crop {


    public Tomato yields(){
        if(!this.getHasBeenHarvested() && this.getHasBeenFertilized()){
            return new Tomato();
        }
        return null;
    }

}
