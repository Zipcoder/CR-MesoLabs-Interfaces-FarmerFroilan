package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/1/18
 */
public class Horse extends Animal implements Rideable {
    private static final String fDEFAULT_NAME = "Butt Stallion";
    private Rider rider;
    private boolean wasRiddenToday;

    public Horse() {
        this(fDEFAULT_NAME);
    }

    public Horse(String name) {
        super(name);
        rider = null;
        wasRiddenToday = false;
    }

    public void speak() {
        // neeeeeiiiighhh or whatever
    }

    public void startRide(Rider rider) {
        wasRiddenToday = true;
        this.rider = rider;
    }

    public void stopRide() {
        rider = null;
    }

    public Rider getRider() {
        return rider;
    }

    public boolean wasRiddenToday() {
        return wasRiddenToday;
    }
}
