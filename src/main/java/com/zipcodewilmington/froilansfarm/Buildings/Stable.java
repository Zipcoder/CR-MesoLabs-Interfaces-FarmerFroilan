package com.zipcodewilmington.froilansfarm.Buildings;

import com.zipcodewilmington.froilansfarm.FarmAnimal.Horse;

import java.util.ArrayList;

public class Stable {

    ArrayList<Horse> horses = new ArrayList<>();

    public void addHorse(Horse horse) {
        this.horses.add(horse);
    }

    public ArrayList<Horse> getHorses() {
        return this.horses;
    }
}
