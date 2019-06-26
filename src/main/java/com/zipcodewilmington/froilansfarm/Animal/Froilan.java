package com.zipcodewilmington.froilansfarm.Animal;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Field;
import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Vehicles.Rideable;

import java.util.ArrayList;
import java.util.List;


public class Froilan extends Farmer implements Driver {

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


    @Override
    public void plant(Field field, CropRow cropRow) {
        field = new Field();
        field.add(cropRow);
    }

    @Override
    public void mount(Rideable rideable) {

    }

    @Override
    public void dismount(Rideable rideable) {

    }
}
