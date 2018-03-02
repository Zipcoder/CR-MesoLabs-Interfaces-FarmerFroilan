package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.*;

import java.util.ArrayList;

public abstract class Person implements NoiseMaker, Eater, Rider {

    private String name;
    private ArrayList<Edible> foodInventory;
    private boolean currentlyRidingSomething = false;

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
        return "Anything, because person is never instantiated and this is overridden by child classes";
    }

    public boolean isCurrentlyRidingSomething() {
        return currentlyRidingSomething;
    }

    public void mount(Rideable thingToMount) {
        if (!currentlyRidingSomething) {
            thingToMount.mounted();
            currentlyRidingSomething = true;
        }
    }

    public void dismount(Rideable thingToMount) {
        if (currentlyRidingSomething) {
            thingToMount.dismounted();
            currentlyRidingSomething = false;
        }
    }

    // Can be abstract? Only two people, Farmer and Pilot

}
