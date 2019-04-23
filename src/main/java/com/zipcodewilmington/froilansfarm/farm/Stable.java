package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animal.Horse;

import java.util.ArrayList;

public class Stable {

    private final ArrayList<Horse> horsesInStable = new ArrayList<Horse>();

    public ArrayList<Horse> getHorsesInStable() {
        return horsesInStable;
    }

    public void startOfDayReset(){
        for (Horse horse: horsesInStable) {
            horse.startOfDayReset();
        }
    }
}
