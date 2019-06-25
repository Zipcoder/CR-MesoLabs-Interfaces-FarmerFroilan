package com.zipcodewilmington.froilansfarm.Animal;
import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Vehicles.Driveable;

import java.util.ArrayList;
import java.util.List;

public class Froilan extends Farmer implements Driver {

    List<Edible> foodEaten = new ArrayList<Edible>();

    public Froilan() {
        super("Froilan");
    }

    public boolean canDrive() {
        return true;
    }

    @Override
    public void eatEdible(Edible food) {
        foodEaten.add(food);
    }

    @Override
    public String makeNoise() {
        return "I'm Froilan! Welcome to mah farm!"; }


    public void drive(Driveable vehicle) {

    }

    public void ceaseDrive(Driveable vehicle) {

    }
}
