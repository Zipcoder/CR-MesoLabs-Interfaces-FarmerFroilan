package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Vehicles.Rideable;
import java.util.ArrayList;
import java.util.List;


public class Horse implements Animal, Rideable {

        com.zipcodewilmington.froilansfarm.Animal.Horse horse;
        boolean isMounted;
        List<Edible> foodEaten = new ArrayList<Edible>();
        List<Horse> horses = new ArrayList();

        public Horse(){
            super();
        }

        public boolean isHungry() {
            if (!hasEaten()) {
                return false;
            } return true;
        }

        public List reproduce(Integer increaseBy) {
            for (int i = 0; i < increaseBy; i++) {
                horses.add(horse);
            } return horses;
        }

        public void eatEdible(Edible e) {
            if (foodEaten.isEmpty()) {
                foodEaten.add(e);
            }
        }

        public boolean hasEaten() {
            if (isHungry() || foodEaten.isEmpty()) {
                return true;
            } return false;
        }

        public List<Edible> getFoodEaten() {
            return foodEaten;
        }

        public String makeNoise() {
            if (!hasEaten() && isHungry()) {
                return "Neigh! Neigh!";
            } return null;
        }

        public boolean isMounted() {
            return isMounted;
        }

        public void setMounted(boolean mounted) {
            isMounted = mounted;
        }

}
