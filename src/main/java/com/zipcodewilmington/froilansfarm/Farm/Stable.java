package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animal.Horse;

import java.util.ArrayList;

public class Stable {

    private final ArrayList<Horse> horsesInStable = new ArrayList<Horse>();

    public void addHorse(){
        horsesInStable.add(new Horse());
    }

    public ArrayList<Horse> getHorsesInStable(){
        return horsesInStable;
    }

}
