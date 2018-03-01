package com.zipcodewilmington.froilansfarm.farm.things.livingthings;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Edible;

public interface Produce {
    Edible yield(boolean hasBeenFertilized, boolean hasBeenHarvested);
}
