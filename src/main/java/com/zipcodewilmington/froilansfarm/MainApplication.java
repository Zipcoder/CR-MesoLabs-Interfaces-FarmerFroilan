package com.zipcodewilmington.froilansfarm;

import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

import java.util.ArrayList;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication {

    public static void main(String[] args) {
//1 field of 5 CropRow
        Field field = new Field();
//row1
        CornStalk cornStalk = new CornStalk(true, true);
        cornStalk.yield();
        CropRow cropRow1 = new CropRow();
        cropRow1.addCrop(cornStalk);
//row2
        TomatoPlant tomatoPlant = new TomatoPlant(true,true);
        tomatoPlant.yield();
        CropRow cropRow2 = new CropRow();
        cropRow2.addCrop(tomatoPlant);
//row3
        CornStalk cornStalk1 = new CornStalk(false,true);
        CropRow cropRow3 = new CropRow();
        cropRow3.addCrop(cornStalk1);
//row4
        TomatoPlant tomatoPlant1 = new TomatoPlant(true, false);
        CropRow cropRow4 = new CropRow();
        cropRow4.addCrop(tomatoPlant1);
//row5
        CornStalk cornStalk2 = new CornStalk(false, false);
        CropRow cropRow5 = new CropRow();
        cropRow5.addCrop(cornStalk2);

//add the cropRow to the field
        field.addCrop(cropRow1);
        field.addCrop(cropRow2);
        field.addCrop(cropRow3);
        field.addCrop(cropRow4);
        field.addCrop(cropRow5);

//create 4 chicken coops
        ChickenCoop chickenCoop1 = new ChickenCoop();
        ChickenCoop chickenCoop2 = new ChickenCoop();
        ChickenCoop chickenCoop3 = new ChickenCoop();
        ChickenCoop chickenCoop4 = new ChickenCoop();
//add 15 chickens in each chickenCoop
        for(int i = 0; i < 15; i++) {
            chickenCoop1.addChicken(new Chicken(true));
            chickenCoop2.addChicken(new Chicken(true));
            chickenCoop3.addChicken(new Chicken(true));
            chickenCoop4.addChicken(new Chicken(true));
        }
//add the chickenCoops to the arrayList. so now we have 3 chickencoops
        ArrayList<ChickenCoop> chickenCoops = new ArrayList<ChickenCoop>();
        chickenCoops.add(chickenCoop1);
        chickenCoops.add(chickenCoop2);
        chickenCoops.add(chickenCoop3);

//create 3 stables
        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        Stable stable3 = new Stable();
//add 10 horses in each stable
        for(int i = 0; i < 10; i++) {
            stable1.addHorse(new Horse());
            stable2.addHorse(new Horse());
            stable3.addHorse(new Horse());
        }
//add the stables in to the arrayList
        ArrayList<Stable> stables = new ArrayList<Stable>();
        stables.add(stable1);
        stables.add(stable2);
        stables.add(stable3);
//a farm has stables, chickenCoops and ONE farmhouse. SOO create a farmhouse
        Farmhouse farmhouse = new Farmhouse();

//create 2 farm vehicles(which are tractors)
        Tractor tractor1 = new Tractor();
        Tractor tractor2 = new Tractor();
//create 1 airplane(Which is a cropDuster)
        CropDuster cropDuster = new CropDuster();

//create sister froilanda
        Pilot froilanda = new Pilot(cropDuster);

        Farm froilanFarm  = new Farm(stables, chickenCoops, farmhouse);

        Farmer froilan = new Farmer(froilanFarm);
    }
}
