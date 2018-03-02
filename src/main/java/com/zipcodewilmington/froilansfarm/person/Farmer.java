package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.animal.Chicken;
import com.zipcodewilmington.froilansfarm.animal.Egg;
import com.zipcodewilmington.froilansfarm.crop.Crop;
import com.zipcodewilmington.froilansfarm.crop.CropRow;
import com.zipcodewilmington.froilansfarm.farm.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.Silo;
import com.zipcodewilmington.froilansfarm.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

import java.util.ArrayList;

public class Farmer extends Person implements Rider, Botanist{

    private final ArrayList<Edible> eggHarvest = new ArrayList<Edible>();

    public Farmer(){
        this.name = "Froilan";
    }

    public void plant(CropRow cropRow, Crop crop) {
        Class classOfCrop = crop.getClass();
        for (int i = 0; i < 100; i++){
            try {
                cropRow.getCropsInRow().add((Crop) classOfCrop.newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }


    public String makeNoise() {
        return "I am making noise!";
    }

    public void eatBreakfast(Silo silo){
        this.eat(silo.removeAnEarCorn());
        this.eat(silo.removeATomato());
        this.eat(silo.removeATomato());
        this.eat(silo.removeAnEgg());
        this.eat(silo.removeAnEgg());
        this.eat(silo.removeAnEgg());
        this.eat(silo.removeAnEgg());
        this.eat(silo.removeAnEgg());

    }
}
