package com.zipcodewilmington.froilansfarm.animals.farmAnimal;

import com.zipcodewilmington.froilansfarm.animals.Animal;
import com.zipcodewilmington.froilansfarm.producers.produce.Egg;
import com.zipcodewilmington.froilansfarm.producers.produce.ProduceInterface;

public class Chicken extends Animal implements ProduceInterface  {
    private Egg egg;
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
        this.fertilized = fertilized;
    }


    public void yield() { if (hasBeenFertilized() == true){
        egg = new Egg();
        fertilized = false;
    }
    }

    public String makeNoise() { return "Cluck!"; }


}


