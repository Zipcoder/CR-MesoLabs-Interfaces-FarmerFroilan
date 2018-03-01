package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people;

import com.zipcodewilmington.froilansfarm.farm.things.Rideable;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Edible;
import com.zipcodewilmington.froilansfarm.farm.field.CropRow;

public class Farmer extends Person implements Botanist,Rider {
    public Farmer(String name) {
        super(name);
    }

    public void plant(Crop cropToPlant, CropRow plantingLocation) {

    }

    public String makeNoise() {
        return null;
    }

    public void mount(Rideable ride) {

    }

    public void dismount(Rideable ride) {

    }
}
