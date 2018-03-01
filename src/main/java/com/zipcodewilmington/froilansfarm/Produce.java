package com.zipcodewilmington.froilansfarm;

public interface Produce {

    boolean hasBeenFertilized = false;
    // has to yield edible object when hasBeenFertilized == true
    public Edible yield();

}
