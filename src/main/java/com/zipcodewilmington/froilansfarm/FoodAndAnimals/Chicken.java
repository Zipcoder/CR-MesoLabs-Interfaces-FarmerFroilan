package com.zipcodewilmington.froilansfarm.FoodAndAnimals;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken extends Animal implements Produce{
    int idNumber;

    public Chicken(){
        this.idNumber = 0000;
    }
    public Chicken(int idNumber){
        this.idNumber = idNumber;
    }

    public String makeNoise() {
        return null;
    }

    public Object yield() {
        return null;
    }

    public boolean hasBeenHarvested() {
        return false;
    }

    public boolean hasBeenFertilized() {
        return false;
    }
}
