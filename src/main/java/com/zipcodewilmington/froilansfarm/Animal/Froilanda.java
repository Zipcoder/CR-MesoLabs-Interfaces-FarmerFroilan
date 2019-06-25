package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.Edible;

import com.zipcodewilmington.froilansfarm.Vehicles.Flyable;


import java.util.ArrayList;
import java.util.List;

public class Froilanda extends Farmer implements Pilot {

        List<Edible> foodEaten = new ArrayList<Edible>();

        public Froilanda() {
            super("Froilanda");
        }

        public void eatEdible(Edible food) {
                    foodEaten.add(food);
        }

        public List<Edible> getFoodEaten() {
            return foodEaten;
        }

        @Override
        public String makeNoise() {
            return "Welcome to Froilan's farm. I'm Froilanda; the rootinest, tootinest pilot down in these parts!";
        }
}
