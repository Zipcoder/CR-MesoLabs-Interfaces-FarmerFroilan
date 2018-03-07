package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Horse extends Animal implements Rideable {

    private boolean isMounted;
    private boolean hasBeenRidden;

    public Horse() {
        this.isMounted = false;
        this.hasBeenRidden = false;
    }

    public void toggleIsMounted() {
        if (isMounted) {
            this.isMounted = false;
            this.hasBeenRidden = true;
        } else {
            this.isMounted = true;
        }
    }

    public boolean getIsMounted() {
        return isMounted;
    }

    public boolean getHasBeenRidden() {
        return this.hasBeenRidden;
    }

    public void makeNoise(){
        System.out.println("neigh");
    }

    public void eat(Edible object) {
        System.out.println("yum");
    }

}
