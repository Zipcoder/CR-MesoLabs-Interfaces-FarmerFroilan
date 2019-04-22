package com.zipcodewilmington.froilansfarm.farm.things.livingthings;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Edible;

public interface Produce {
    Edible yield();
    void fertilize();
    Boolean isFertilized();
    void harvest();
    Boolean isHarvested();
}
