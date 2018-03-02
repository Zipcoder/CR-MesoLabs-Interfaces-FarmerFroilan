package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

import java.util.ArrayList;

public abstract class Animal implements NoiseMaker, Eater{

    public ArrayList<Edible> getFoodFed() {
        return foodFed;
    }

    ArrayList<Edible> foodFed = new ArrayList<Edible>();

    public String makeNoise(){
        return "";
    }
}
