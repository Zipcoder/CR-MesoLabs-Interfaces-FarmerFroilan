package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Produce.Milk;

import java.util.ArrayList;
import java.util.List;

public class Cow implements Animal {

        List<Edible> foodEaten = new ArrayList<Edible>();

        public Cow() {
        }

        public boolean isMilkable() {
            return (!foodEaten.isEmpty());
        }

        public Milk yieldMilk() {
            if (isMilkable()) {
            } return new Milk();
        }

        public String makeNoise() {
            return "Mooo!! Mooooo!!";
        }

        public List<Edible> getFoodEaten() {
            return foodEaten;
        }

        @Override
        public void eatEdible(Edible food) {
            foodEaten.add(food);
    }
}

