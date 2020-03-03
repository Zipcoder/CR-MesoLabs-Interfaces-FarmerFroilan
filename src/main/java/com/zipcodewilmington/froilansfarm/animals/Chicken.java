package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.food.Edible;

import java.util.ArrayList;

public class Chicken implements Animal{
    private Integer id;


    public Chicken(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return this.id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public Chicken(){}


    public boolean eatFood(Edible edible) {
        return true;
    }

    public String makeNoise() {
        String noise = "cluck, cluck, cluck";
        return noise;
    }
}
