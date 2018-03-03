package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

    public class Chicken extends Animal implements Produce {

        public Egg egg = new Egg();
        public EdibleEgg edibleEgg = new EdibleEgg();
        public boolean hasBeenFertilized = false;

        private Chicken chicken;

        public Chicken(){

        }

        public Object yields() {
            return null;
    }

        public void eat() {
        }

        public String makeNoise() {
            return null;
        }

    }
