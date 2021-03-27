package com.zipcodewilmington.froilansfarm.person;
import com.zipcodewilmington.froilansfarm.CropRow;
import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.food.Eater;
import com.zipcodewilmington.froilansfarm.food.Edible;
import com.zipcodewilmington.froilansfarm.plants.Crop;
import jdk.internal.vm.annotation.Stable;

public class Farmer extends Person implements Botanist {
    private String name = "Froilan";

    public Farmer(String name) {
        this.name = name;
    }

    public String makeNoise() {

        return "ahhhhhhhh!";

    }

    public void eat(Edible edible) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void mount(Rideable thingsToMount){

    }

    @Override
    public void unmount(Rideable rideable) {

    }

    public void dismount(Rideable thingDismount) {

    }

    @Override
    public void plant(Crop crop, CropRow row) {

    }

    @Override
    public void fertilize(Crop crop) {

    }

}
