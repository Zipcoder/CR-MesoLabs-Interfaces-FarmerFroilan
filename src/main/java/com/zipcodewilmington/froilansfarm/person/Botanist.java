package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.Ridable;
import com.zipcodewilmington.froilansfarm.shelter.CropRow;

public class Botanist extends Person{

    public Botanist(String name){
        super(name);
    }

    //Passes Crop objects into croprows -> DONE
    public void plantCrops(Crop crop, CropRow cropRow){
        cropRow.add(crop);
    }
}
