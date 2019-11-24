package com.zipcodewilmington.froilansfarm.mainFarm;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.edibles.Eggs;


import java.util.ArrayList;

public class ChickenCoop {
    private Chicken chicken = new Chicken();

    private Chicken[] chickenCoop1 = {chicken,chicken,chicken};
    private Chicken[] chickenCoop2 = {chicken,chicken,chicken,chicken};
    private Chicken[] chickenCoop3 = {chicken,chicken,chicken,chicken};
    private Chicken[] chickenCoop4 = {chicken,chicken,chicken,chicken};
    private ArrayList<Chicken[]> chickenCoops;
    public ArrayList<Eggs> eggStorage;

    public void populateChickenCoops(){
        chickenCoops.add(chickenCoop1);
        chickenCoops.add(chickenCoop2);
        chickenCoops.add(chickenCoop3);
        chickenCoops.add(chickenCoop4);
    }

    public void dailyEggs(){
        for(Chicken[] cc : chickenCoops){
            for(Chicken c : cc){
                Eggs egg = c.layEgg();
                eggStorage.add(egg);
            }

        }
    }
}
