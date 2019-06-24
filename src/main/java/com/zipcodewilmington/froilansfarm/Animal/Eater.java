package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.Edible;

import java.util.List;


public interface Eater {

        public void eatEdible(Edible food);
        public boolean hasEaten();
        public List<Edible> getFoodEaten();
}
