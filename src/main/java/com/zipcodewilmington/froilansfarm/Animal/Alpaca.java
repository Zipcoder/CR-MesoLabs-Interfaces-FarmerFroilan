package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Produce.Wool;

import java.util.ArrayList;
import java.util.List;

public class Alpaca implements Animal {

        com.zipcodewilmington.froilansfarm.Animal.Alpaca alpaca;
        List<Edible> foodEaten = new ArrayList<Edible>();
        List alpacaWoolBasket = new ArrayList();

        public Alpaca() {
            super();
        }

        public List collectWool() {
            Wool wool = new Wool();
            if (isShearable()) {
                alpacaWoolBasket.add(wool);
            } return alpacaWoolBasket;
        }

        public boolean isShearable() {
            if (hasEaten() && !isHungry()) {
                return true;
            } return false;
        }

        public boolean isHungry() {
            if (!hasEaten()) {
                return true;
            } return false;
        }

        public List reproduce(Integer increaseBy) {
            List<com.zipcodewilmington.froilansfarm.Animal.Alpaca> alpacas = new ArrayList();
            for (int i = 0; i < increaseBy; i++) {
                alpacas.add(alpaca);
                return alpacas;
            } return null;
        }

        public void eatEdible(Edible e) {
            if (!isHungry()) {
                foodEaten.add(e);
            }
        }

        public boolean hasEaten() {
            if (foodEaten.isEmpty()) {
                return false;
            } return true;
        }

        public List<Edible> getFoodEaten() {
            return foodEaten;
        }

        public String makeNoise() {
            if (!hasEaten() && isHungry()) {
                return "Mehh! Mehh!";
            } return null;
        }

    public boolean makesNoise() {
        return false;
    }
}
