package com.zipcodewilmington.froilansfarm.producers.produce;

import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Chicken;
import com.zipcodewilmington.froilansfarm.factories.ChickenFactory;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Edible;
import com.zipcodewilmington.froilansfarm.storage.ChickenCoops;

import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;

public class Egg implements Edible {
    String male;
    String female;

    ArrayList<Chicken> chickenCoop = new ArrayList<Chicken>();
    Chicken chicken = new Chicken(male);



    public Egg(){

    }

    public Boolean hasBeenHarvested() {
        ChickenFactory chickenFactory = new ChickenFactory();


        if(chickenCoop.contains(chickenFactory.createChicken(chicken, male)) ){ return false;} else
            return true; }

    public Boolean hasBeenFertilized() {
        ChickenFactory chickenFactory = new ChickenFactory();

        if(chickenCoop.contains(chickenFactory.createChicken(chicken, male)) == true){ return true;} return false; }
}
