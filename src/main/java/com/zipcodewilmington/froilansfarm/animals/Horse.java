package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.people.Rider;

public class Horse extends Animals implements Rideable {
    private Rider currentRider;
    private Boolean wasRidden;

    public Boolean riderRiding(Rider rider) {
        return null;
    }

    public void dismount() {

    }
}
