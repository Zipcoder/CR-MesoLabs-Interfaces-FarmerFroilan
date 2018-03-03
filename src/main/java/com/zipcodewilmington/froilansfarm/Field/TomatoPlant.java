package com.zipcodewilmington.froilansfarm.Field;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

import java.util.ArrayList;

public class TomatoPlant extends Crop {

    private Tomato tomato;

    public TomatoPlant(){

    }

    public Object yields(){
        return tomato;
    }

    public Boolean hasBeenHarvested() {

        return null;
    }

    public Boolean hasBeenFertilized() {

        return null;
    }

}
