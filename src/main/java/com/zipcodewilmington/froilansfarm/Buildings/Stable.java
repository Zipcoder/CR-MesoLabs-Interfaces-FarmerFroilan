package com.zipcodewilmington.froilansfarm.Buildings;

import com.zipcodewilmington.froilansfarm.Animals.Horse;

import java.util.ArrayList;

public class Stable {

    private ArrayList<Horse> horses = new ArrayList<Horse>();

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public void addHorse(Horse newHorse) {
        horses.add(newHorse);
    }

}
