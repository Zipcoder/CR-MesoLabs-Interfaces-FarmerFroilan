package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.*;

import java.util.ArrayList;

public abstract class Person implements NoiseMaker, Eater, Rider {

    private String name;
    private ArrayList<Edible> foodInventory;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Edible> getFoodInventory() {
        return foodInventory;
    }

    public void eat(Edible food) {
        food = null;
    }

    public String makeNoise() {
        return "Hey";
    }

    public void mount(Rideable thingToMount) {
        thingToMount.mounted();
    }

    public void dismount(Rideable thingToMount) {
        thingToMount.dismounted();
    }

    // Can be abstract? Only two people, Farmer and Pilot

}
