package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.farm.CropRow;

public class Farmer extends Person implements Botanist, Rider{


    public Farmer(String name, String gender) {
        super(name, gender);
    }

    public void plant() {
    }

    public void eat() {
    }

    public String makeNoise() { return "Howdy Partner"; }
}
