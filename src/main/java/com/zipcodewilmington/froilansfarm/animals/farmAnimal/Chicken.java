package com.zipcodewilmington.froilansfarm.animals.farmAnimal;

import com.zipcodewilmington.froilansfarm.animals.Eater;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Edible;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.NoiseMaker;
import com.zipcodewilmington.froilansfarm.producers.produce.ProduceInterface;

public class Chicken implements ProduceInterface , Eater, NoiseMaker {
    public void eat() {

    }

    public Edible yield() {
        return null;
    }

    public void makeNoise() {

    }
}
