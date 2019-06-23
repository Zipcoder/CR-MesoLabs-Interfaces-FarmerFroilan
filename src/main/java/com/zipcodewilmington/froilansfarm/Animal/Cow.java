package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Produce.Milk;

import java.util.ArrayList;
import java.util.List;

public class Cow implements Animal, NoiseMaker, Eater {


        private com.zipcodewilmington.froilansfarm.Animal.Cow cow;
        Milk milk;
        List<Edible> milkCartons = new ArrayList<Edible>();
        List<Edible> foodEaten = new ArrayList<Edible>();

        public Cow() {
            super();
        }

        public boolean isMilkable() {
            if (!isHungry() && hasEaten()) {
                return true;
            } return false;
        }

        public List yieldMilk() throws Exception {
            if (isMilkable()) {
                milkCartons.add(milk);
                return milkCartons;
            } else throw new Exception
                    ("This cow is not producing milk at the moment. May yield milk later.");
        }

        public String makeNoise() {
            if (!hasEaten() && isHungry()) {
                return "Mooo mooo!";
            } return null;
        }

        public boolean isHungry() {
            if (!hasEaten() && foodEaten.isEmpty())
                return false;
            return true;
        }

        public List reproduce(Integer increaseBy) {
            List<com.zipcodewilmington.froilansfarm.Animal.Cow> cows = new ArrayList();
            for (int i = 0; i < increaseBy; i++) {
                cows.add(cow);
            } return cows;
        }

        public void eatEdible(Edible e) {
            if (isHungry()) {
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
}
