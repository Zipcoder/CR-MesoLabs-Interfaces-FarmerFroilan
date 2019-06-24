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
            //Establish conditions later
            return true;
        }

        public Milk yieldMilk() throws Exception {
            if (isMilkable()) {
                return new Milk();
            } else throw new Exception
                    ("This cow is not producing milk at the moment. May yield milk later, after she has been well fed.");
        }

        public String makeNoise() {
            return "Mooo!! Mooooo!!";
        }

        public void eatEdible(Edible e) {
                foodEaten.add(e);
        }

        public List<Edible> getFoodEaten() {
            return foodEaten;
        }
}
