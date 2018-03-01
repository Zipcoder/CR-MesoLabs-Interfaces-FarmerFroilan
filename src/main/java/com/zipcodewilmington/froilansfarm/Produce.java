package com.zipcodewilmington.froilansfarm;

public interface Produce {

    boolean fertilized = false;

    public Edible yield();
    // has to yield edible object when hasBeenFertilized == true

    public boolean isFertilized();

    public boolean fertilize();

}
