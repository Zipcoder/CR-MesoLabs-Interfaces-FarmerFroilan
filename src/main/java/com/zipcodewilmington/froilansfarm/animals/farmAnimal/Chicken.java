package com.zipcodewilmington.froilansfarm.animals.farmAnimal;

import com.zipcodewilmington.froilansfarm.animals.Animal;
import com.zipcodewilmington.froilansfarm.animals.Eater;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Edible;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.NoiseMaker;
import com.zipcodewilmington.froilansfarm.producers.produce.ProduceInterface;

public class Chicken extends Animal implements ProduceInterface  {
    public void eat() {

    }

    public Edible yield() {
        return null;
    }

    public void makeNoise() {

    }
}
