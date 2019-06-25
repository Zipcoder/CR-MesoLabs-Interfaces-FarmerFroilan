package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Produce.Wool;

import java.util.ArrayList;
import java.util.List;

public class Alpaca implements Animal {

        Alpaca alpaca;
        List<Edible> foodEaten = new ArrayList<Edible>();
        List alpacaWoolBasket = new ArrayList();

        public Alpaca() {
            super();
        }

        public Wool collectWool() {
            return new Wool();
        }

        public boolean isHungry () {
            if (foodEaten.isEmpty()) {
                return true;
            } return false;
        }

        public List reproduce(Integer increaseBy) {
            List<Alpaca> alpacas = new ArrayList();
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

        public List<Edible> getFoodEaten() {
            return foodEaten;
        }

        public String makeNoise() {
                if (isHungry()) {
                    return "Mehh! Mehh!";
                } return null;
        }
}
