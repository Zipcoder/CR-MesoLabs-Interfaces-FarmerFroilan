package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

import java.util.ArrayList;

public class Horse extends Animal implements Rideable{

    boolean mounted = false;

    public ArrayList<Edible> getFoodFed() {
        return foodFed;
    }

    ArrayList<Edible> foodFed = new ArrayList<Edible>();

    @Override
    public String makeNoise() {
        return "Neighh";
    }

    public void canRide() {
        this.mounted = true;
    }

    public boolean isRiding(){
        return this.mounted;
    }
    public void stopRiding(){
        if(mounted == true){
            this.mounted = false;
        }
    }

    public void eat(Edible edible) {
        foodFed.add(edible);
    }

}
