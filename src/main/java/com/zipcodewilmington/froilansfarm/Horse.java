package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Edible.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Animal;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Horse implements Animal, Rideable{
    protected int calories;
    protected Rider rider;

    public int getCalories() {
        return calories;
    }

    public String makeNoise() {
        return "Neigh";
    }

    public void setRider(){
        this.rider = null;
    }

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public void eat(Edible edible) {
        this.calories += edible.calories;
    }
}
