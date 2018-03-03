package com.zipcodewilmington.froilansfarm.Buildings;

import com.zipcodewilmington.froilansfarm.Animals.Horse;

import java.util.ArrayList;

public class Stable {

    private ArrayList<Horse> horsesInStable;

    public Stable() {
        horsesInStable = new ArrayList<Horse>();
    }

    public ArrayList<Horse> getHorsesInStable() {
        return horsesInStable;
    }

    public void addHorseToStable(Horse aHorse) {
        horsesInStable.add(aHorse);
    }

    public void removeHorseFromStable(Horse aHorse) {
        horsesInStable.remove(aHorse);
    }


}
