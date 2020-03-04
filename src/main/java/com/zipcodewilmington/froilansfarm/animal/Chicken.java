package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.Eater;
import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.food.Egg;

public class Chicken extends Animal implements Produce {



    public Boolean yield() {
        Egg newEgg = new Egg();
        return true;
    }

    public Boolean storeFood() {
        return false;
    }

    public void Eat() {
    }

    public void MakeNoise() {
        System.out.println("Bawwwk buk buk buk buk buk BCAW!");
    }
}
