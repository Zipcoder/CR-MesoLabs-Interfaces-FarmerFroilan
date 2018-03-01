package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.crop.CropRow;
import com.zipcodewilmington.froilansfarm.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Farmer extends Person implements Rider, Botanist{

    private String name = "Froilan";

    public void plant(CropRow cropRow, Crop crop) {
        if (cropRow.getCropsInRow().size() < 5) {
            cropRow.getCropsInRow().add(crop);
        }
    }

    public String makeNoise() {
        return "I am making noise!";
    }

    public void mount() {

    }

    public void dismount() {

    }

    public void eat(Edible food) {

    }
}
