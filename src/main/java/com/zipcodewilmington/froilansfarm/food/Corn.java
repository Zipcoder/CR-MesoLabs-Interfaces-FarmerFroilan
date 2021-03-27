package com.zipcodewilmington.froilansfarm.food;

import com.zipcodewilmington.froilansfarm.plants.Crop;

public class Corn implements Edible {
    int corn = 1;

    public boolean wasEaten() {

        if(corn == 1)
            return false;

        return true;
    }

    public void makeEaten() {

        corn = 0;
    }


}
