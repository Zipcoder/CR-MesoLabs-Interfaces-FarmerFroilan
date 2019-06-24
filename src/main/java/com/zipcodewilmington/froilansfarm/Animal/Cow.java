package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Produce.Milk;

import java.util.ArrayList;
import java.util.List;

public class Cow implements Animal {


        private Cow cow;
        Milk milk;
        List<Edible> milkCartons = new ArrayList<Edible>();
        List<Edible> foodEaten = new ArrayList<Edible>();
        List<Cow> cows = new ArrayList();

        public Cow() {
            super();
        }

        public boolean isMilkable() {
            if (!isHungry()) {
                return true;
            } return false;
        }

        public Milk yieldMilk() throws Exception {
            if (isMilkable()) {
                return new Milk();
            } else throw new Exception
                    ("This cow is not producing milk at the moment. May yield milk later, after she has been well fed.");
        }

        public String makeNoise() {
            if (isHungry()) {
            } return "Mooo!! Mooooo!!";
        }

        public boolean isHungry() {
            if (foodEaten.isEmpty())
                return true;
            return false;
        }

        public List reproduce(Integer increaseBy) {
            for (int i = 0; i < increaseBy; i++) {
                cows.add(cow);
            } return cows;
        }

        public void eatEdible(Edible e) {
            if (isHungry()) {
                foodEaten.add(e);
            }
        }

        public List<Edible> getFoodEaten() {
            return foodEaten;
        }
}
