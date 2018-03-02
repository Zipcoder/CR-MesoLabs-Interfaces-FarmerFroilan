package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people;

import com.zipcodewilmington.froilansfarm.farm.things.NoiseMaker;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.Creature;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.Eater;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Edible;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.PeopleFood;

public abstract class Person extends Creature {
    public Person(String name) {
        super(name);
    }

    public void eat(Edible food){
        if(food instanceof PeopleFood){
            this.hasEaten=true;
            this.energyReserves += food.getEnergyValue();
        }

    }

}
