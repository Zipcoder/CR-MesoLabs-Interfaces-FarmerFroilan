package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edible.Tomato;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class TomatoPlant extends Crop{

    public TomatoPlant(){

    }

    public Edible yield() {
        return new Tomato();

    }

    @Override
    public String toString(){
        return "Tomato Plant";
    }
}
