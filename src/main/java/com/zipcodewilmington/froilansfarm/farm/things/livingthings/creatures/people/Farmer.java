package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people;

import com.zipcodewilmington.froilansfarm.farm.things.Rideable;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Edible;
import com.zipcodewilmington.froilansfarm.farm.field.CropRow;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.PeopleFood;

public class Farmer extends Person implements Botanist,Rider {
    public Farmer(String name) {
        super(name);
    }

    public void plant(Crop cropToPlant, CropRow plantingLocation) {
        plantingLocation.addCrop(cropToPlant);

    }

    public String makeNoise() {

        return "E I E I O";
    }

    public void mount(Rideable ride) {
        ride.getOn();

    }

    public void dismount(Rideable ride) {
        ride.getOff();

    }



}
