package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures;

import com.zipcodewilmington.froilansfarm.farm.things.NoiseMaker;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.AnimalFeed;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Edible;

public abstract class Creature implements Eater,NoiseMaker {
    protected String name;
    protected boolean hasEaten;
    protected int energyReserves;

    public Creature(String name){

        this.name = name;
        this.energyReserves = 0;
    }

    public Creature(){this.energyReserves=0;}

    public String getName(){
        return this.name;
    }

    public boolean hasBeenFed(){
        return this.hasEaten;
    }

    public int getEnergyReserves(){
        return this.energyReserves;
    }

    public void sleep(){
        this.energyReserves=0;
        this.hasEaten=false;
    }

}
