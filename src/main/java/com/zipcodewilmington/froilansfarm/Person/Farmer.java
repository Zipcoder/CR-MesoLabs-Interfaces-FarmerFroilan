package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Farmer extends Person implements Rider, Botanist {
    public void mount() {

    }

    public void dismount() {

    }

    public String makeNoise() {
        return "Hi, I'm a farmer";
    }


    public void eat(Edible edible) {

    }

    public void plantCrop(CropRow cropRow, Crop crop) {

    }
}
