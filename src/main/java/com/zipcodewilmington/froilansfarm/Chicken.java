package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Baskets.Basket;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.Edibles.Egg;

public class Chicken extends Animal implements Produce<Egg> {
    private boolean hasBeenFertilized;
    Basket cornBasket;

    public boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public String makeNoise() {
        return "chickenNoise";
    }

    public Egg yield() {
        if (hasBeenFertilized) {
            return new Egg();
        }
        else return null;
    }

    public void eat(Edible edible) {
        cornBasket.remove(2);

        }
    public void eat(Meals meal) {


    }
}
