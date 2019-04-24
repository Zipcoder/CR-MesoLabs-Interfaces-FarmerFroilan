package com.zipcodewilmington.froilansfarm.FarmBuildings;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Crops.WatermelonPlant;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

public class Farm {

    FarmHouse farmHouse = new FarmHouse();
    Stable[] stables = new Stable[3];
    ChickenCoop[] chickenCoop = new ChickenCoop[4];
    Tractor tractorOfFroilan = new Tractor();
    CropDuster cropDusterOfFroilanda = new CropDuster();
    Field farmField;
    Refrigerator refrigerator = new Refrigerator();

    public Farm(){
        CornStalk cornStalk = new CornStalk();
        TomatoPlant tomatoPlant = new TomatoPlant();
        WatermelonPlant watermelonPlant = new WatermelonPlant();
        CropRow cropRow0Corn = new CropRow(cornStalk);
        CropRow cropRow1Tomato = new CropRow(tomatoPlant);
        CropRow cropRow2Watermelon = new CropRow(watermelonPlant);
        CropRow cropRow3Watermelon = new CropRow(watermelonPlant);
        CropRow cropRow4Tomato = new CropRow(tomatoPlant);

        farmField = new Field(cropRow0Corn, cropRow1Tomato, cropRow2Watermelon, cropRow3Watermelon, cropRow4Tomato);

        Chicken chicken = new Chicken();
        chickenCoop[0] = new ChickenCoop();
        chickenCoop[1] = new ChickenCoop();
        chickenCoop[2] = new ChickenCoop();
        chickenCoop[3] = new ChickenCoop();
        for (int i = 0; i < 3; i++){
            chickenCoop[i].addChickens(chicken);
        }
        chickenCoop[3].getChickens().add(chicken);
        chickenCoop[3].getChickens().add(chicken);
        chickenCoop[3].getChickens().add(chicken);

        Horse horse = new Horse();
        stables[0] = new Stable();
        stables[1] = new Stable();
        stables[2] = new Stable();
        for (int i = 0; i < 3; i++){
            stables[i].addHorse(horse);
        }
        stables[2].getHorses().add(horse);

        farmHouse.getPeople().add(new Farmer());
        farmHouse.getPeople().add(new Pilot());
    }


}
