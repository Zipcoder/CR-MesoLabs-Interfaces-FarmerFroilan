package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.crop.CropRow;
import com.zipcodewilmington.froilansfarm.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

import java.util.ArrayList;

public class Farmer extends Person implements Rider, Botanist{

    private String name = "Froilan";
    private ArrayList<Edible> foodEaten = new ArrayList<Edible>();

    public void plant(CropRow cropRow, Crop crop) {
        for (int i = 0; i < 25; i++){
            cropRow.getCropsInRow().add(crop);
        }
    }

    public String makeNoise() {
        return "I am making noise!";
    }

    public void mount(Rideable rideable) {
        rideable.ride();
    }

    public void dismount(Rideable rideable) {
        rideable.stopRiding();
    }

    public void eat(Edible food) {
        foodEaten.add(food);
    }

    public ArrayList<Edible> getFoodEaten() {
        return foodEaten;
    }
}
