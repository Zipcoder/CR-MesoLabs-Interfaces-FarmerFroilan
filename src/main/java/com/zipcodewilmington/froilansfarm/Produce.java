package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.edible.Edible;

public interface Produce {

    public boolean hasBeenHarvested = false;
    public boolean hasBeenFertilized = false;

    //should this be void??
    public void yield(Edible edible);

}
