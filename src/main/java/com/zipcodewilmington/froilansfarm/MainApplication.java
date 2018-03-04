package com.zipcodewilmington.froilansfarm;

import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

import java.util.ArrayList;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication {

    public static void main(String[] args) {

        Field field = new Field();

        CornStalk cornStalk = new CornStalk(true, true);
        cornStalk.yield();
        CropRow cropRow1 = new CropRow();
        cropRow1.addCrop(cornStalk);

        TomatoPlant tomatoPlant = new TomatoPlant(true,true);
        tomatoPlant.yield();
        CropRow cropRow2 = new CropRow();
        cropRow2.addCrop(tomatoPlant);

        CornStalk cornStalk1 = new CornStalk(false,true);
        CropRow cropRow3 = new CropRow();
        cropRow3.addCrop(cornStalk1);

        TomatoPlant tomatoPlant1 = new TomatoPlant(true, false);
        CropRow cropRow4 = new CropRow();
        cropRow4.addCrop(tomatoPlant1);

        CornStalk cornStalk2 = new CornStalk(false, false);
        CropRow cropRow5 = new CropRow();
        cropRow5.addCrop(cornStalk2);


        field.addCrop(cropRow1);
        field.addCrop(cropRow2);
        field.addCrop(cropRow3);
        field.addCrop(cropRow4);
        field.addCrop(cropRow5);


        ChickenCoop chickenCoop1 = new ChickenCoop();
        ChickenCoop chickenCoop2 = new ChickenCoop();
        ChickenCoop chickenCoop3 = new ChickenCoop();
        ChickenCoop chickenCoop4 = new ChickenCoop();

        for(int i = 0; i < 15; i++) {
            chickenCoop1.addChicken(new Chicken(true));
            chickenCoop2.addChicken(new Chicken(true));
            chickenCoop3.addChicken(new Chicken(true));
            chickenCoop4.addChicken(new Chicken(true));

        }

        ArrayList<ChickenCoop> chickenCoops = new ArrayList<ChickenCoop>();
        chickenCoops.add(chickenCoop1);
        chickenCoops.add(chickenCoop2);
        chickenCoops.add(chickenCoop3);

        //Stable
        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();

        for(int i = 0; i < 10; i++) {
            stable1.addHorse(new Horse());
            stable2.addHorse(new Horse());
            stable3.addHorse(new Horse());

        }


        ArrayList<Stable> stables = new ArrayList<Stable>();
        stables.add(stable1);
        stables.add(stable2);
        stables.add(stable3);

        Farmhouse farmhouse = new Farmhouse();


        Tractor tractor1 = new Tractor();
        Tractor tractor2 = new Tractor();
        CropDuster cropDuster = new CropDuster();


        Pilot froilanda = new Pilot(cropDuster);
        Farm froilanFarm  = new Farm(stables, chickenCoops, farmhouse);
        Farmer froilan = new Farmer(froilanFarm);
    }
}
