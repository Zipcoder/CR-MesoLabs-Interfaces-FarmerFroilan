package com.zipcodewilmington.froilansfarm.FarmAnimal;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Horse extends Animal implements Rideable {

    private boolean isMounted;

    @Override
    public void mount() {
        this.isMounted = true;
    }

    @Override
    public void dismount() {
        this.isMounted = false;
    }

    @Override
    public boolean getMountedStatus() {
        return this.isMounted;
    }

}
