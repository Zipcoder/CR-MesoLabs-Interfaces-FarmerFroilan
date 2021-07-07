package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Baskets.Basket;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.Edible;

import java.util.Base64;

public class Horse extends Animal implements Ridable {
    private boolean ready = true;
    Basket cornBasket = new Basket<EarCorn>();
    Horse horse;

    public boolean getReady() {
        return ready;
    }

    public void mount() {
        ready = true;
    }

    public void dismount() {
        ready = false;
    }

    public String makeNoise() {
        return "horseNoise";

    }
    public void eat(Meals meal){};

    @Override
    public void eat(Edible edible) {

    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }
}
