package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.food.Edible;

import java.util.ArrayList;

public class Chicken implements Animal{
    private Integer id;
    private ArrayList<String> edible;

    public Chicken(Integer id, ArrayList edible){
        this.id = id;
        this.edible = edible;
    }

    

    public boolean eatFood(Edible edible) {
        return false;
    }

    public String makeNoise() {
        return null;
    }
}
