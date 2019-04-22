package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people;

import com.zipcodewilmington.froilansfarm.farm.buildings.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.buildings.WareHouse;
import com.zipcodewilmington.froilansfarm.farm.things.NoiseMaker;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.Creature;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.Eater;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals.Chicken;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Edible;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.EdibleType;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Egg;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.PeopleFood;

public abstract class Person extends Creature {
    public Person(String name) {
        super(name);
    }

    public void eat(EdibleType food, WareHouse storageToEatFrom) {
        Edible meal = storageToEatFrom.getEdibleByType(food);
        if(meal instanceof PeopleFood){
            this.hasEaten = true;
            this.energyReserves += meal.getEnergyValue();
            storageToEatFrom.removeEdibleByType(food);
        }
    }

    public Egg harvestEgg (Chicken targetChicken){
        targetChicken.harvest();
        return targetChicken.yield();
    }

    public void collectEggs (ChickenCoop targetCoop, WareHouse wareHouseToDepositWith){
        for (Chicken c : targetCoop.getAllChickens()){
            wareHouseToDepositWith.addEdible(this.harvestEgg(c));
        }
        wareHouseToDepositWith.removeNulls();
    }

}
