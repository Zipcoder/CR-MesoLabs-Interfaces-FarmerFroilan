package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

import java.util.ArrayList;

public abstract class Person implements NoiseMaker, Eater{
    private final ArrayList<Edible> foodEaten = new ArrayList<Edible>();
    protected String name;

    public void startOfDayReset(){
        this.foodEaten.clear();
    }
    public void eat(Edible food) {
        this.foodEaten.add(food);
    }
    public ArrayList<Edible> getFoodEaten() {
        return this.foodEaten;
    }
    public void mount(Rideable rideable) {
        rideable.ride();
    }

    public void dismount(Rideable rideable) {
        rideable.stopRiding();
    }

    public String getName() {
        return this.name;
    }
}
