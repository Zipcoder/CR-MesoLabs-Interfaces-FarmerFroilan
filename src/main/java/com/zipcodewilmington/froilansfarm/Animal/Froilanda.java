package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.Edible;

import java.util.ArrayList;
import java.util.List;

public class Froilanda implements Pilot, Person {

        Froilanda froilanda;
        List<Edible> foodEaten = new ArrayList<Edible>();

        public Froilanda() {
            super();
            this.froilanda = new Froilanda();

        }

        public void flyAirCraft() {

        }

        public void eatEdible(Edible e) {

        }

    public boolean hasEaten() {
        return false;
    }

    public List<Edible> getFoodEaten() {
        return null;
    }


    public void feedFarmAnimals(Eater animal, Edible food) {

    }

    public boolean isHungry() {
        return false;
    }

    public List reproduce(Integer increaseBy) {
        return null;
    }

    public String makeNoise() {
        return null;
    }
}
