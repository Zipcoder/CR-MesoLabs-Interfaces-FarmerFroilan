package com.zipcodewilmington.froilansfarm.FarmBuildings;

import com.zipcodewilmington.froilansfarm.Animals.Horse;

import java.util.ArrayList;

public class Stable {

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    ArrayList<Horse> horses = new ArrayList<Horse>();

    public void addHorse(Horse horse){
       for (int i = 0; i < 3; i++){
        horses.add(horse);
    }
    }
}
