package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Vehicle.Aircraft;
import com.zipcodewilmington.froilansfarm.interfaces.Pilot;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/3/18
 */
public class Duster extends Farmer implements Pilot {
    public Duster(String name, int startingStamina) {
        super(name, startingStamina);
    }

    public void fly(Aircraft aircraft) {
        aircraft.takeOff(this);
    }
}
