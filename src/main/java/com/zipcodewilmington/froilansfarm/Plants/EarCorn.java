package com.zipcodewilmington.froilansfarm.Plants;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class EarCorn implements Edible {

    private boolean hasBeenEaten = false;

    public void getsEaten() {
        this.hasBeenEaten = true;
    }

    // made by CornStalk

}
