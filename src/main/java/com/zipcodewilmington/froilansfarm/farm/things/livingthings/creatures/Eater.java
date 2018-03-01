package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Edible;

public interface Eater<E extends Edible> {
    void eat (E food);
}
