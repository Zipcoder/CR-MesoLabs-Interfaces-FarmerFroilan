package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;


public class FertilizedEgg extends Egg implements Produce{
    public ChickHen chickHen = new ChickHen();
    public ChickRooster chickRooster = new ChickRooster();

    public Object yields() {
        if (Math.random() < 0.5) {
            return chickHen;
        } else return chickRooster;

    }


}
