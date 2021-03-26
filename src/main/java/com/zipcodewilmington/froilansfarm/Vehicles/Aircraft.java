package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Persons.Rider;

public abstract class Aircraft implements Vehicle {
    boolean fly(boolean bool) {
        return false;
    }

    public boolean isMounted(Rider obj) {
        return false;
    }
}
