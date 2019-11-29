package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.miscinterfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.miscinterfaces.Rideable;
import com.zipcodewilmington.froilansfarm.miscinterfaces.Rider;
import com.zipcodewilmington.froilansfarm.food.Eater;
import com.zipcodewilmington.froilansfarm.food.Edible;

public abstract class Person  implements NoiseMaker, Eater, Rider {

    String name;
    int foodEaten;
    private boolean currentlyRidingSomething = false;
    private Rideable thingBeingRidden;

    public Person() {
    }


    public void eat(Edible edible){

        if(!edible.wasEaten()) {
            edible.makeEaten();
            foodEaten++;
        }
    }


    public int getFoodEaten(){
        return foodEaten;
    }

    public String makeNoise(String speak) {
        return "Hey! there ";
    }


    public boolean isCurrentlyRidingSomething() {
        return currentlyRidingSomething;
    }

    public void mount(Rideable thingToMount) {
        if (!currentlyRidingSomething) {
            thingBeingRidden = thingToMount;
            currentlyRidingSomething = true;
        }
    }

    public void dismount(Rideable thingDismount) {
        if (currentlyRidingSomething) {
          //  thingBeingRidden.dismount();
            thingBeingRidden = null;
            currentlyRidingSomething = false;
        }
    }


}


