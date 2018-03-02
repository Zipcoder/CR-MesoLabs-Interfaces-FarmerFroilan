package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Edible.Edible;

public abstract class Produce <T extends Edible> {
    protected boolean isFertilized = false;

    public abstract T yield();

    public void fertilize(){
        this.isFertilized = true;
    }
}
