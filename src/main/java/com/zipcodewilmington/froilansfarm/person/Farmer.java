package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;

public class Farmer extends Person implements Botanist, Rider{


    public Farmer(String name, String gender) {
        super(name, gender);
    }

    public void plants(Crop crop, CropRow cropRow, Integer numOfCrops) {

    }

    public void mount(Rideable rideable) {

    }

    public void dismount(Rideable rideable) {

    }

    public void ride(Rideable rideable) {

    }

    public void Eat() {

    }

    public void MakeNoise() {

    }
}
