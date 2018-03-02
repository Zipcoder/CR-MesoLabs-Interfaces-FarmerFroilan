package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Edible.Edible;
import com.zipcodewilmington.froilansfarm.Edible.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Interfaces.Animal;

import java.util.ArrayList;

public class Chicken extends Produce implements Animal{

    protected int calories;
    protected ArrayList<ReproductiveEgg> eggs;


    public int getCalories() {
        return calories;
    }

    public Chicken(){
        this.calories = 0;
        this.eggs = new ArrayList<ReproductiveEgg>();
    }

    public String makeNoise() {
        return "Cheep!";
    }

    public void eat(Edible edible) {
        this.calories += edible.calories;
    }

    public EdibleEgg yield() {
        if (!this.isFertilized) return new EdibleEgg();
        else {
            eggs.add(this.layReproductiveEgg());
        }
        return null;
    }

    public ReproductiveEgg layReproductiveEgg(){
        return new ReproductiveEgg();
    }

}
