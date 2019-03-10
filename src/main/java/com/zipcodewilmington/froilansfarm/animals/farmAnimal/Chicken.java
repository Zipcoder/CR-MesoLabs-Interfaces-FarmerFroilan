package com.zipcodewilmington.froilansfarm.animals.farmAnimal;

import com.zipcodewilmington.froilansfarm.animals.Animal;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Edible;
import com.zipcodewilmington.froilansfarm.producers.produce.Egg;
import com.zipcodewilmington.froilansfarm.producers.produce.ProduceInterface;

public class Chicken extends Animal implements ProduceInterface  {
    private Egg edibleEgg;
    private Boolean fertilized;


    public Chicken(){ fertilized = false;}

    public Boolean isFertilized() {
        return fertilized;
    }

    public boolean hasBeenFertilized(){
        fertilized = true;
        return true;
    }


    public void setIsFertilized(Boolean fertilized) {
        this.fertilized = hasBeenFertilized();
    }

    public Egg yield() {
        if (hasBeenFertilized()){
           return edibleEgg;
        }
        return null;
    }

    public Egg getEgg(){
        return edibleEgg;
    }



    public String makeNoise() { return "Cluck!"; }


}


