package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Buildings.Stable;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

abstract public class Person implements Eater, NoiseMaker, Rider {





    public void rideHorsesInStable(Stable aStable, Person aPerson) {

        for (int i = 0; i < aStable.getHorsesInStable().size(); i++) {
            aPerson.mount(aStable.getHorsesInStable().get(i));
        }
    }



}
