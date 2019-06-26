package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.*;

import java.util.ArrayList;
import java.util.List;

public class Cow extends Produce implements Animal {

        List<Edible> foodEaten = new ArrayList<Edible>();

        public Cow() {
        }

        public boolean isMilkable() {
            if (foodEaten.isEmpty() == false);
            return true;
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

        @Override
        public Bounty yield() {
            return new MilkGallons();
        }
}

