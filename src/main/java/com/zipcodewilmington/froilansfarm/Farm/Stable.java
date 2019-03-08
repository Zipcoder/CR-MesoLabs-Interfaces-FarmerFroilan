package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Horse;

import java.util.ArrayList;

public class Stable {
    private ArrayList<Horse> horses;

    public Stable(){
        this.horses = new ArrayList<>();
    }

    public Stable(Horse... horses){
        this.horses = new ArrayList<>();
        for (Horse horse:horses) {
            this.addHorse(horse);
        }
    }

    public void addHorse(Horse horse){
        this.horses.add(horse);
    }

    public void removeHorse(Horse horse){
        this.horses.remove(horse);
    }

    public void setHorses(ArrayList<Horse> horses) {
        this.horses = horses;
    }

    public ArrayList<Horse> getHorses() {
        return horses;
    }
}
