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

        public String makNoise() {
            return "Welcome to mah farm!";
        }
}
