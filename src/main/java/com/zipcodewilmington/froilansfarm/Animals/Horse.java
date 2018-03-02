package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Horse extends Animal implements Rideable {

    private boolean isMounted;

    public Horse() {
        this.isMounted = false;
    }

    public void toggleIsMounted() {
        if (isMounted) {
            this.isMounted = false;
        } else {
            this.isMounted = true;
        }
    }

    public boolean getIsMounted() {
        return isMounted;
    }

    public void makeNoise(){
        System.out.println("neigh");
    }

    public void eat(Edible object) {
        System.out.println("yum");
    }

}
