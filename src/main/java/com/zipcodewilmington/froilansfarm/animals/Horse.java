package com.zipcodewilmington.froilansfarm.animals;

import com.zipcodewilmington.froilansfarm.food.Edible;
import com.zipcodewilmington.froilansfarm.vehicles.Vehicle;

public class Horse extends Vehicle implements Animal {
    private Integer id;

    public Horse(Integer id){
        this.id = id;
    }
    public Horse() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean eatFood(Edible edible) {
        return true;
    }

    public String makeNoise() {
        return null;
    }

    public boolean ride() {
        return false;
    }

    public boolean stopRiding() {
        return false;
    }
}
