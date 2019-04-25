package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public interface Produce {

    boolean fertilized = false;

    public Edible yield();
    // has to yield edible object when hasBeenFertilized == true

    public boolean isFertilized();

    public boolean fertilize();

}
