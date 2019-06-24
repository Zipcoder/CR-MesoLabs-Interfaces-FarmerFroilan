package com.zipcodewilmington.froilansfarm.Animal;



import com.zipcodewilmington.froilansfarm.FoodStorage;
import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Produce.Tomatoes;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

import java.util.ArrayList;
import java.util.List;

public class Froilan extends Farmer implements Person, Driver, NoiseMaker, Eater {
    Farmer farmer=new Farmer();
    public boolean canDrive() {
        return true;
    }

    public boolean makesNoise() {
        return true;
    }
    FoodStorage foodStorage=new FoodStorage();

        Froilan froilan;
        List<Edible> foodEaten = new ArrayList<Edible>();

        public Froilan() {
            super();
        }

    public void drive() {

    }
}
