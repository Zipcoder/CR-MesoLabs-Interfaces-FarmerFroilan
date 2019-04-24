package com.zipcodewilmington.froilansfarm.BuildingAndPlaces;

import java.util.ArrayList;

public abstract class Farm {
    protected FarmHouse farmHouse = FarmHouse.getInstance();
    protected ArrayList<Stable> stables = new ArrayList<Stable>();
    protected ArrayList<ChickenCoop> chickenCoops = new ArrayList<ChickenCoop>();

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public void addStable(int numberOfHorses){
        Stable stable = new Stable(numberOfHorses);
        stables.add(stable);
    }

    public void removeStable(){
        stables.remove(stables.get(stables.size()-1));
    }

    public void addChickenCoop(int numberOfChickens){
        ChickenCoop chickenCoop = new ChickenCoop(numberOfChickens);
        chickenCoops.add(chickenCoop);
    }

    public void removeChickenCoop(){
        chickenCoops.remove(chickenCoops.get(chickenCoops.size()-1));
    }
}
