package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Chicken extends Animal {

    public String makeNoise() {
        return "L'Eggo my Eggo";
    }

    public boolean eat() {
        return true;
    }
}
