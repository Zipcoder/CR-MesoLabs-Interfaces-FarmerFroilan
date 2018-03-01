package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.Eater;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.ChickenFeed;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Edible;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.Produce;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Egg;

public class Chicken extends Animal implements Produce {

    private boolean fertilized;
    private boolean harvested;

    public Chicken(String name){
        super(name);
    }


    public void eat(ChickenFeed food) {

    }

    public String makeNoise() {
        return null;
    }

    public Egg yield(boolean hasBeenFertilized, boolean hasBeenHarvested) {
        return null;
    }

}
