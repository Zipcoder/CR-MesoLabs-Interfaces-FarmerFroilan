package com.zipcodewilmington.froilansfarm.animals.farmAnimal;

import com.zipcodewilmington.froilansfarm.animals.Animal;
import com.zipcodewilmington.froilansfarm.producers.produce.Egg;
import com.zipcodewilmington.froilansfarm.producers.produce.ProduceInterface;

public class Chicken extends Animal implements ProduceInterface  {
    private Egg egg;
    private Boolean fertilized = false;

    public Egg yield() {
        return null;
    }


    public String makeNoise() { return "Cluck!"; }


}


