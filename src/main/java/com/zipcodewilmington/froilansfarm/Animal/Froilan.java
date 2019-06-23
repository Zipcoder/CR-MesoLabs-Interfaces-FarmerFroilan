package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.Edible;

import java.util.ArrayList;
import java.util.List;


public class Froilan extends Farmer {

        com.zipcodewilmington.froilansfarm.Animal.Froilan froilan;
        List<Edible> foodEaten = new ArrayList<Edible>();

        public Froilan() {
            super();
        }
    }

    public boolean canDrive() {
        return true;
    }

    public boolean makesNoise() {
        return true;
    }
}
