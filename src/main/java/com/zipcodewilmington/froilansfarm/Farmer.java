package com.zipcodewilmington.froilansfarm;

import java.util.List;

public class Farmer implements Botanist {

Tomato tomato=new Tomato();
    public Tomatoes harvest(CropRow<TomatoPlant> tomatorow){
        Tractor tractor = new Tractor();
        Tomatoes tomatoes = new Tomatoes();
        List<TomatoPlant> tomatoPlantsInTheRow = tomatorow.getTplant();
        for (TomatoPlant tomatoPlantInTheRow:tomatoPlantsInTheRow)
              {
                  tomatoes.addTomatoes(tractor.harvest(tomatoPlantInTheRow));
        }return tomatoes;
    }
   // public Tomatoes tomatoesStorage(){
       // FoodStorage<tomato> tomnotostorage;
//tomnotostorage.add(tomato)

    }


