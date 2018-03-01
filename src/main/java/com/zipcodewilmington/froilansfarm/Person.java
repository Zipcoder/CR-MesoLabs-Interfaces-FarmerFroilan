package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Person implements NoiseMaker, Eater, Rider{

    private String name;

    private ArrayList<Edible> foodInventory;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat(Edible food) {

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
