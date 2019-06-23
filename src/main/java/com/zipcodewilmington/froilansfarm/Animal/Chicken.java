package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Produce.Egg;
import com.zipcodewilmington.froilansfarm.Produce.Produce;


import java.util.ArrayList;
import java.util.List;

public class Chicken extends Produce implements Animal {

    Chicken chicken;
    List<Edible> foodEaten = new ArrayList<Edible>();
    List<Edible> eggBasket = new ArrayList<Edible>();

    public Chicken() {
        super();
    }

    public boolean fertilized() {
        if (hasEaten() && !isHungry()) {
            return false;
        }
        return true;
    }

    public List<Edible> yieldEggs() throws Exception {
        Egg egg = new Egg();
        if (!fertilized()) {
            eggBasket.add(egg);
            return eggBasket;
        } else throw new Exception
                ("This chicken has been fertilized and cannot produce edible eggs.");
    }

    public boolean isHungry() {
        if (!hasEaten() && foodEaten.isEmpty())
            return false;
        return true;
    }

    public List reproduce(Integer increaseBy) {
        List<Chicken> chickens = new ArrayList();
        for (int i = 0; i < increaseBy; i++) {
            chickens.add(chicken);
        }
        return chickens;
    }

    public void eatEdible(Edible e) {
        if (isHungry()) {
            foodEaten.add(e);
        }
    }

    public boolean hasEaten() {
        if (foodEaten.isEmpty()) {
            return false;
        }
        return true;
    }

    public List<Edible> getFoodEaten() {
        return foodEaten;
    }

    public String makeNoise() {
        if (!hasEaten() && isHungry()) {
            return "Cluck! Cluck! Cluck-a-cluck!";
        } return null;
    }
        @Override
        public Boolean hasEdible() {
            return !fertilized;
        }
}
