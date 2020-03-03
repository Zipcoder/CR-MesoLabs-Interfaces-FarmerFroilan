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

    public Integer getId(){
        return this.id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public ArrayList<String> getEdible(){
        return this.edible;
    }

    public void setEdible(ArrayList edible){
        this.edible= edible;
    }

    public Chicken(){}


    public boolean eatFood(Edible edible) {
        return false;
    }

    public String makeNoise() {
        return null;
    }
}
