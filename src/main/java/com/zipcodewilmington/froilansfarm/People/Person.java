package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Buildings.Stable;
import com.zipcodewilmington.froilansfarm.Interfaces.*;

import java.util.ArrayList;

public abstract class Person implements NoiseMaker, Eater, Rider {

    private String name;
    private ArrayList<Edible> foodInventory = new ArrayList<Edible>();
    boolean currentlyRidingSomething = false;

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

    // Horse exercise tested in FarmerTest
    public void excerciseHorses(Stable stable) {
        for (int i = 0; i < stable.getHorses().size(); i++) {
            mount(stable.getHorses().get(i));
            stable.getHorses().get(i).gallop();
            dismount(stable.getHorses().get(i));
        }
    }

}
