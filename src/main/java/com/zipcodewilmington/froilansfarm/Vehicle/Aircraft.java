package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.interfaces.Flying;
import com.zipcodewilmington.froilansfarm.interfaces.Pilot;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/1/18
 */
public abstract class Aircraft extends Vehicle implements Flying {
    private Pilot pilot;

    public Aircraft() {
        super();
        pilot = null;
    }

    public void makeNoise() {
        // [General aircraft noise]
    }

    public void takeOff(Pilot pilot) {
        this.pilot = pilot;
    }

    public void land() {
        pilot = null;
    }
}
