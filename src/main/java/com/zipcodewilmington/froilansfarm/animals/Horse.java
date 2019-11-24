package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Horse extends Animals implements Rideable {
    private Rider currentRider;
    private Boolean wasRidden;

    public String makeNoise(){
        return "Neigh";
    }

    public Boolean mounted() {
        wasRidden = true;
        return wasRidden;
    }

    public Boolean dismounted() {
        wasRidden = false;
        return wasRidden;
    }
}
