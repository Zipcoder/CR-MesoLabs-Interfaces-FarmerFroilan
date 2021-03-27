package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.food.Edible;

public interface Producer {


    Edible yield();
    boolean hasBeenFertilized();
    boolean hasBeenHarvested();

}
