package com.zipcodewilmington.froilansfarm.mainFarm;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.edibles.Eggs;

import java.util.ArrayList;

public class ChickenCoop {
    private Chicken chicken = new Chicken();
    public Chicken[] chickenCoop = {chicken,chicken,chicken,chicken,chicken,chicken,chicken,chicken,chicken,chicken};
    public ArrayList<Eggs> eggStorage;

    public void dailyEggs(){
        for(Chicken c : chickenCoop){
            Eggs egg = c.layEgg();
            eggStorage.add(egg);
        }
    }
}
