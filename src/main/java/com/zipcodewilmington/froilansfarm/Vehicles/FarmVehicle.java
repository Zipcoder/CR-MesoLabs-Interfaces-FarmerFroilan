package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Persons.Rider;

public abstract class FarmVehicle implements Vehicle {
    boolean operate(boolean bool) {
        return false;
    }

    public boolean isMounted(Rider obj) {
        return false;
    }
}
