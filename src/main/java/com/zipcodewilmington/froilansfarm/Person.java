package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Person implements NoiseMaker, Eater, Rider{

    private ArrayList<Edible> foodInventory;

    public void eat(Edible food) {

    }

    public String makeNoise() {
        return "Hey";
    }

    public void mount(Rideable thingToMount) {

    }

    public void dismount(Rideable thingToMount) {

    }

    // Can be abstract? Only two people, Farmer and Pilot

}
