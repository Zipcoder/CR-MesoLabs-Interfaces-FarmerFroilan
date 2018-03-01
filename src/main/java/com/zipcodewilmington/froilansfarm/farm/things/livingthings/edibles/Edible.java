package com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles;

public abstract class Edible implements AnimalFeed,PeopleFood {
    protected  int energyValue;

    public Edible(int energyValue){
        this.energyValue = energyValue;
    }

    public  int getEnergyValue(){
        return energyValue;
    }


}
