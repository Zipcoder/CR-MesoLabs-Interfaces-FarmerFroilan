package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

import java.util.ArrayList;

public class Pilot extends Person implements Rider {

    private ArrayList<Edible> foodEaten = new ArrayList<Edible>();
    private String name = "Froilanda";


    public void eat(Edible food) {
        foodEaten.add(food);
    }

    public String makeNoise() {
        return "I'm the best pilot ever!";
    }

    public void mount(Rideable rideable) {
        rideable.ride();
    }

    public void dismount(Rideable rideable) {
        rideable.stopRiding();
    }

    public ArrayList<Edible> getFoodEaten() {
        return foodEaten;
    }
}
