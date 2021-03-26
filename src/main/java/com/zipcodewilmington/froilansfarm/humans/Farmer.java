package com.zipcodewilmington.froilansfarm.humans;

import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.Rider;
import com.zipcodewilmington.froilansfarm.edible.Edible;

import java.util.ArrayList;
import java.util.List;

public class Farmer extends Person implements Botanist, Rider, Pilot{
    private String name;

    public Farmer (String name) {
        this.name = name;

    }

    public String getName(){
        return this.name;
    }

    public void plantCrop() {

    }

    public void eat(Edible edible) {

    }

    public String makeNoise() {
        return null;
    }

    public void mount(Rideable rideable) {

    }

    public void dismount(Rideable rideable) {

    }




}
