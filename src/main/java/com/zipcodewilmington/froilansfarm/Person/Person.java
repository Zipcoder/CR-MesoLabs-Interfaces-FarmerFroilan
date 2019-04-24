package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

import java.util.ArrayList;

public abstract class Person implements NoiseMaker, Eater {
    public String name;
    public ArrayList<Edible> getFoodFed() {
        return foodFed;
    }

    ArrayList<Edible> foodFed = new ArrayList<Edible>();

    public void eat(Edible edible){
        this.getFoodFed().add(edible);
    }

    public String makeNoise(){
        return "";
    }

    public String getName(){
        return this.name;
    }
}
