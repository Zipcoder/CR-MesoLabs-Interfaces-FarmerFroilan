package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Edible.Edible;

public abstract class Produce {
    boolean isFertilized = false;

    public abstract Edible yield();
}
