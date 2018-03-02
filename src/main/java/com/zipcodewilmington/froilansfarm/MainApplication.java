package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.crop.CornStalk;
import com.zipcodewilmington.froilansfarm.crop.CropRow;
import com.zipcodewilmington.froilansfarm.crop.PotatoPlant;
import com.zipcodewilmington.froilansfarm.crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.farm.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.Silo;
import com.zipcodewilmington.froilansfarm.farm.Stable;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.person.Pilot;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication {

    Farmer froilan = (Farmer) Farm.getInstance().getFarmHouse().getPeopleLivingInFarmHouse().get(0);
    Pilot froilanda = (Pilot) Farm.getInstance().getFarmHouse().getPeopleLivingInFarmHouse().get(1);
    Silo silo = Farm.getInstance().getFoodSilo();
    Stable[] stables = Farm.getInstance().getStables();
    ChickenCoop[] chickenCoops = Farm.getInstance().getChickenCoops();
    CropRow[] cropRows = Farm.getInstance().getFroilansField().getCropRowsInField();

    public void sundayRoutine(){

        Farm.getInstance().startOfDayReset();
        froilan.eatBreakfast();
        froilanda.eatBreakfast();
        froilan.feedHorses(stables, silo);
        froilan.rideHorses(stables);
        froilanda.feedChickens(chickenCoops, silo);
        froilan.plant(cropRows[0], new CornStalk());
        froilan.plant(cropRows[1], new TomatoPlant());
        froilan.plant(cropRows[2], new PotatoPlant());

    }

}
