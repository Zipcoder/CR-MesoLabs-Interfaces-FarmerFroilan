package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures;

import com.zipcodewilmington.froilansfarm.farm.buildings.WareHouse;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.EdibleType;

public interface Eater {
    void eat (EdibleType typeToEat, WareHouse storageToEatFrom);
}
