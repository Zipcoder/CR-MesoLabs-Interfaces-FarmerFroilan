package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.interfaces.Ridable;
import com.zipcodewilmington.froilansfarm.shelter.CropRow;

public class Botanist extends Person{

    public Botanist(String name){
        super(name);
    }

    public void plantCrops(Crop crop, CropRow cropRow){
        //PLANT THE CROP IN THE CROPROW
    }

    public void mount(Ridable mountable) {

    }

    public void dismount(Ridable mountable) {

    }
}
