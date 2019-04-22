package com.zipcodewilmington.froilansfarm.farm.buildings;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals.Horse;

import java.util.ArrayList;

public class Stable {
    private ArrayList<Horse> horses;

    public Stable(Horse ... horsesToAdd){
        this.horses = new ArrayList<>(0);
        for (Horse h : horsesToAdd){
            this.horses.add(h);
        }
    }

    public void addHorse(Horse horseToAdd){
        this.horses.add(horseToAdd);

    }

    public void removeHorse(Horse horseToRemove){
        this.horses.remove(horseToRemove);


    }

    public ArrayList<Horse> getAllHorses(){
        return this.horses;
    }

    public Horse getHorse(Horse horseToGet){

        return this.horses.get(this.horses.indexOf(horseToGet));
    }

    public Horse getHorse(int horseIndex){
        return this.horses.get(horseIndex);
    }

    public Horse getHorse(String name){
        for(Horse h : this.horses){
            if (h.getName().equals(name)) return h;
        }
        return null;
    }

    public int getStableSize(){
        return this.horses.size();
    }

}
