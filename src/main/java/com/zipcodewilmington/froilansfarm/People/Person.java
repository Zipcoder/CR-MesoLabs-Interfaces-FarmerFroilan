package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Buildings.Stable;
import com.zipcodewilmington.froilansfarm.Interfaces.*;

import java.util.ArrayList;

public abstract class Person implements NoiseMaker, Eater, Rider {

    private String name;
    private ArrayList<Edible> foodInventory = new ArrayList<Edible>();
    private boolean currentlyRidingSomething = false;
    private Rideable thingBeingRidden;

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

    public Rideable getThingBeingRidden() {
        return thingBeingRidden;
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
            thingBeingRidden = thingToMount;
            currentlyRidingSomething = true;
        }
    }

    public void dismount() {
        if (currentlyRidingSomething) {
            thingBeingRidden.dismounted();
            thingBeingRidden = null;
            currentlyRidingSomething = false;
        }
    }

    // Horse exercise tested in FarmerTest
    public void exerciseHorses(Stable stable) {
        for (int i = 0; i < stable.getHorses().size(); i++) {
            mount(stable.getHorses().get(i));
            stable.getHorses().get(i).gallop();
            dismount();
        }
    }

}
