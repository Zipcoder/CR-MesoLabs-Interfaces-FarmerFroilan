package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Produce.Egg;
import com.zipcodewilmington.froilansfarm.Produce.Produce;

import java.util.ArrayList;
import java.util.List;

public class Chicken extends Produce implements Animal {

    List<Edible> foodEaten = new ArrayList<Edible>();
    List<Chicken> chickens = new ArrayList();

    public Chicken() {
        super();
    }

    public boolean fertilized() {
        if (!isHungry()) {
            return true;
        } return false;
    }

    public Egg yieldEgg() throws Exception {
        if (!fertilized()) {
            return new Egg();
        } else throw new Exception
                ("This chicken has been fertilized and cannot produce edible eggs.");
    }

    public boolean isHungry() {
        if (foodEaten.isEmpty())
            return true;
        return false;
    }

    public List reproduce(Integer increaseBy) {
        for (int i = 0; i < increaseBy; i++) {
            chickens.add(new Chicken());
        } return chickens;
    }

    public void eatEdible(Edible e) {
        if (isHungry()) {
            foodEaten.add(e);
        }
    }

    public List<Edible> getFoodEaten() {
        return foodEaten;
    }

    public String makeNoise() {
        if (isHungry()) {
            return "Cluck! Cluck! Cluck-a-luck!";
        } return null;
    }

    @Override
    public Boolean hasEdible() {
        return !fertilized;
    }

}
