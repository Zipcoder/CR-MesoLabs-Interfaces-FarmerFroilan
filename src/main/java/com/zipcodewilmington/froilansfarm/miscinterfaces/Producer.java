package com.zipcodewilmington.froilansfarm.miscinterfaces;

import com.zipcodewilmington.froilansfarm.food.Edible;

public interface Producer {


    Edible yield();
    boolean hasBeenFertilized();
    boolean hasBeenHarvested();

}
