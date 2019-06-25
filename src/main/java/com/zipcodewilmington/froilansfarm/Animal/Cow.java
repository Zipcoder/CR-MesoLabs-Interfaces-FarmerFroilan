package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Produce.Milk;

import java.util.ArrayList;
import java.util.List;

public class Cow implements Animal {

<<<<<<< HEAD
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
=======
    public List reproduce(Integer increaseBy) {
        return null;
    }

    public void eatEdible(Edible food) {

    }

    public boolean isHungry() {
        return false;
    }

    public List<Edible> getFoodEaten() {
        return null;
    }

    public String makeNoise() {
        return null;
    }
}
>>>>>>> 007d8a6e73709d8ba566f678aa3543e2c5b49636
