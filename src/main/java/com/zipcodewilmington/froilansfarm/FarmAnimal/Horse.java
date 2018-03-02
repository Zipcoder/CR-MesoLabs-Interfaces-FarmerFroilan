package com.zipcodewilmington.froilansfarm.FarmAnimal;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Horse extends Animal implements Rideable {

    private boolean isMounted;

    protected void setMountedStatus(boolean mountStatus) {
        this.isMounted = mountStatus;
    }

    protected boolean getMountedStatus() {
        return this.isMounted;
    }

}
