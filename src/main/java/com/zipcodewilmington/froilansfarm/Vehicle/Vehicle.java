package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Exceptions.NoDriverException;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/1/18
 */
public abstract class Vehicle implements NoiseMaker, Rideable {
    private Rider rider;

    public Vehicle() {
        rider = null;
    }

    public void startRide(Rider rider) {
        this.rider = rider;
    }

    public void stopRide() {
        this.rider = null;
    }

    public Rider getRider() {
        return rider;
    }

    public void confirmDriver() throws NoDriverException {
        if (rider == null)
            throw new NoDriverException();
    }
}
