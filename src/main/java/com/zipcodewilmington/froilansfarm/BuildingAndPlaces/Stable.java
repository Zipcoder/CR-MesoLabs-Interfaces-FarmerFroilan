package com.zipcodewilmington.froilansfarm.BuildingAndPlaces;

import com.zipcodewilmington.froilansfarm.FoodAndAnimals.Horse;

import java.util.ArrayList;

public class Stable{
    private ArrayList<Horse> horses = new ArrayList<Horse>();

    public Stable(int numberOfHorses){
        for(int i = 0; i < numberOfHorses; i++){
            addHorse(i);
        }
    }

    public void addHorse(int idNumber){
        Horse horse = new Horse(idNumber);
        horses.add(horse);
    }

    public void removeHorse(){
        horses.remove(horses.get(horses.size()-1));
    }

    public void clearTheStable(){
        horses.clear();
    }
}
