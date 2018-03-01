package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.Eater;
import com.zipcodewilmington.froilansfarm.farm.things.NoiseMaker;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Edible;

public abstract class Animal implements Eater,NoiseMaker {

    public void eat (Edible food){

    }

    public String makeNoise(){
        return null;
    }

}
