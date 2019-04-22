package com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles;

public abstract class Edible {
    protected  int energyValue;

    public Edible(int energyValue){
        this.energyValue = energyValue;
    }

    public  int getEnergyValue(){
        return energyValue;
    }


}
