package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.Edible;

import java.util.ArrayList;
import java.util.List;


public class Froilan extends Farmer implements Driver{

        Froilan froilan;
        List<Edible> foodEaten = new ArrayList<Edible>();

        public Froilan() {
            super("Froilan");
        }

        @Override
        public void eatEdible(Edible food) {
            foodEaten.add(food);
        }

        @Override
        public String makeNoise() {
            return "I'm Froilan! Welcome to mah farm!"; }

}
