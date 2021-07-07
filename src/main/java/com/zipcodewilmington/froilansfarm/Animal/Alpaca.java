package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.*;

import java.util.ArrayList;
import java.util.List;

public class Alpaca extends Produce implements Animal {

        List<Edible> foodEaten = new ArrayList<Edible>();

        public Alpaca() {
        }

        public Wool collectWool() {
            Wool wool = new Wool();
            return wool;
        }

        public List<Edible> getFoodEaten() {
            return foodEaten;
        }

        public String makeNoise() {
            return "Mehh! Mehh!";
        }

        @Override
        public void eatEdible(Edible food) {
                foodEaten.add(food);
        }

        @Override
        public Bounty yield() {
            return new WoolBasket();
        }
}
