package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.crop.*;
import com.zipcodewilmington.froilansfarm.farm.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.Silo;
import com.zipcodewilmington.froilansfarm.farm.Stable;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.person.Pilot;
import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;

import java.util.List;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication {

    private final Farm farm;
    private final Farmer froilan;
    private final Pilot froilanda;
    private final Silo silo;
    private final Stable[] stables;
    private final ChickenCoop[] chickenCoops;
    private final CropRow[] cropRows;
    private final CropDuster froilandasCropDuster;
    private final Tractor froilansTractor;
    private final Field field;

    public MainApplication(){

        this.farm = new Farm();
        this.froilan = (Farmer) farm.getFarmHouse().getPeopleLivingInFarmHouse().get(0);
        this.froilanda = (Pilot) farm.getFarmHouse().getPeopleLivingInFarmHouse().get(1);
        this.silo = farm.getFoodSilo();
        this.stables = farm.getStables();
        this.chickenCoops = farm.getChickenCoops();
        this. cropRows = farm.getFroilansField().getCropRowsInField();
        this.froilandasCropDuster = farm.getFroilandasCropDuster();
        this.froilansTractor = farm.getFroilansTractor();
        this.field = farm.getFroilansField();
    }

    public void sundayRoutine(){

        farm.startOfDayReset();
        froilan.eatBreakfast(silo);
        froilanda.eatBreakfast(silo);
        froilan.feedHorses(stables, silo);
        froilan.rideHorses(stables);
        froilanda.feedChickens(chickenCoops, silo);
        froilan.plant(cropRows[0], new CornStalk());
        froilan.plant(cropRows[1], new TomatoPlant());
        froilan.plant(cropRows[2], new PotatoPlant());
        froilanda.harvestEggs(chickenCoops);
        froilanda.depositEggs(silo);
    }

    public void mondayRoutine(){
        farm.startOfDayReset();
        froilan.eatBreakfast(silo);
        froilanda.eatBreakfast(silo);
        froilan.feedHorses(stables, silo);
        froilan.rideHorses(stables);
        froilan.feedChickens(chickenCoops, silo);
        froilanda.mount(froilandasCropDuster);
        froilandasCropDuster.fly();
        froilandasCropDuster.operate(field);
        froilandasCropDuster.land();
        froilanda.dismount(froilandasCropDuster);
        froilan.harvestEggs(chickenCoops);
        froilan.depositEggs(silo);
    }

    public void tuesdayRoutine(){
        farm.startOfDayReset();
        froilan.eatBreakfast(silo);
        froilanda.eatBreakfast(silo);
        froilan.feedHorses(stables, silo);
        froilan.rideHorses(stables);
        froilanda.feedChickens(chickenCoops, silo);
        froilan.mount(froilansTractor);
        froilansTractor.operate(field);
        froilansTractor.depositHarvest(silo);
        froilan.dismount(froilansTractor);
        froilanda.harvestEggs(chickenCoops);
        froilanda.depositEggs(silo);
    }

    public void wednesdayRoutine(){
        farm.startOfDayReset();
        froilan.eatBreakfast(silo);
        froilanda.eatBreakfast(silo);
        froilan.feedHorses(stables, silo);
        froilan.rideHorses(stables);
        froilanda.feedChickens(chickenCoops, silo);
        froilan.plant(cropRows[0], new CornStalk());
        froilan.plant(cropRows[3], new CornStalk());
        froilan.plant(cropRows[4], new CornStalk());
        froilanda.harvestEggs(chickenCoops);
        froilanda.depositEggs(silo);
    }

    public void thursdayRoutine(){
        mondayRoutine();
    }

    public void fridayRoutine(){
        tuesdayRoutine();
    }
    public void saturdayRoutine(){
        farm.startOfDayReset();
        froilan.eatBreakfast(silo);
        froilanda.eatBreakfast(silo);
        froilan.feedHorses(stables, silo);
        froilan.rideHorses(stables);
        froilanda.feedChickens(chickenCoops, silo);
        froilanda.harvestEggs(chickenCoops);
        froilanda.depositEggs(silo);

    }

    public Farm getFarm() {
        return farm;
    }
}
