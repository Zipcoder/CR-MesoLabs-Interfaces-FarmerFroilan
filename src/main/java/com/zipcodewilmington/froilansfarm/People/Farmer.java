package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.BuildingAndPlaces.Farm;
import com.zipcodewilmington.froilansfarm.FoodAndAnimals.ChickenEgg;
import com.zipcodewilmington.froilansfarm.FoodAndAnimals.Crop;
import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

import java.util.ArrayList;

public class Farmer extends Person implements Botanist {
    private ArrayList<Object> inventoryOfEdibles = new ArrayList<Object>();
    private String name;

    public Farmer(){
        this.name = "";
    }

    public Farmer(String name){
        this.name = name;
    }
    public void plant() {

    }

    public String makeNoise() {
        return null;
    }

    public String getName() {
        return name;
    }

    public Crop harvastCrop(){
        return null;
    }

    public ChickenEgg harvastEgg() {
        return null;
    }

    public void addItemToInventory(){

    }
}
