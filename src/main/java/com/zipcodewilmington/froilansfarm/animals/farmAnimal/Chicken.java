package com.zipcodewilmington.froilansfarm.animals.farmAnimal;

import com.zipcodewilmington.froilansfarm.animals.Animal;
import com.zipcodewilmington.froilansfarm.producers.produce.Egg;
import com.zipcodewilmington.froilansfarm.producers.produce.ProduceInterface;

public class Chicken extends Animal implements ProduceInterface  {
    private Egg egg;
    private boolean female;

    public Chicken(String gender){
    }


    public void yield() {
        egg.hasBeenFertilized();

    }

    public String makeNoise() { return "Cluck!"; }

    public Boolean isNotFemale(Chicken chicken){
        if (female == true){
            return false;
        } else
            return false;
    }

    public Boolean isEdible(boolean defeatheredAndPrepared) {
      if ( defeatheredAndPrepared == true ){
          return true;}
      return false;
    }

}


