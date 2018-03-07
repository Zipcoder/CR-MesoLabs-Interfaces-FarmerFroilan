package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Buildings.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Buildings.Stable;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import com.zipcodewilmington.froilansfarm.Production.CornStalk;
import com.zipcodewilmington.froilansfarm.Production.CropRow;
import com.zipcodewilmington.froilansfarm.Production.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

/**
 * Created by leon on 2/26/18.
 */
public class MainApplication {

    private Farm froilansFarm;
    private CropDuster froilandasCropDuster;
    private Tractor froilansTractor;
    private Farmer froilan;
    private Pilot froilanda;

    public MainApplication() {
        this.froilansFarm = new Farm();
        this.froilandasCropDuster = new CropDuster();
        this.froilansTractor = new Tractor();
        this.froilan = new Farmer();
        this.froilanda = new Pilot();
    }


    public static void main(String[] args) {

        MainApplication main = new MainApplication();
        main.establishThePlot();

    }


    protected void establishThePlot() {
        establishTheField();
        establishTheChickenCoops();
        establishTheStables();
    }

    public void sunday() {


    }

    public void monday() {


    }

    public void tuesday() {


    }

    public Farm getFroilansFarm() {
        return this.froilansFarm;
    }

    public CropDuster getFroilandasCropDuster() {
        return this.froilandasCropDuster;
    }

    public Tractor getFroilansTractor() {
        return this.froilansTractor;
    }

    public Farmer getFroilan() {
        return this.froilan;
    }

    public Pilot getFroilanda() {
        return this.froilanda;
    }

    private void establishTheField() {
        CropRow row1 = new CropRow();
        CornStalk stalk1 = new CornStalk();
        CornStalk stalk2 = new CornStalk();
        CornStalk stalk3 = new CornStalk();
        row1.addCrop(stalk1);
        row1.addCrop(stalk2);
        row1.addCrop(stalk3);

        CropRow row2 = new CropRow();
        TomatoPlant plant1 = new TomatoPlant();
        TomatoPlant plant2 = new TomatoPlant();
        TomatoPlant plant3 = new TomatoPlant();
        row2.addCrop(plant1);
        row2.addCrop(plant2);
        row2.addCrop(plant3);

        CropRow row3 = new CropRow();
        CornStalk stalk4 = new CornStalk();
        CornStalk stalk5 = new CornStalk();
        CornStalk stalk6 = new CornStalk();
        row3.addCrop(stalk4);
        row3.addCrop(stalk5);
        row3.addCrop(stalk6);

        CropRow row4 = new CropRow();
        TomatoPlant plant4 = new TomatoPlant();
        TomatoPlant plant5 = new TomatoPlant();
        TomatoPlant plant6 = new TomatoPlant();
        row4.addCrop(plant4);
        row4.addCrop(plant5);
        row4.addCrop(plant6);

        CropRow row5 = new CropRow();
        CornStalk stalk7 = new CornStalk();
        CornStalk stalk8 = new CornStalk();
        CornStalk stalk9 = new CornStalk();
        row5.addCrop(stalk7);
        row5.addCrop(stalk8);
        row5.addCrop(stalk9);

        froilansFarm.getField().addCropRow(row1);
        froilansFarm.getField().addCropRow(row2);
        froilansFarm.getField().addCropRow(row3);
        froilansFarm.getField().addCropRow(row4);
        froilansFarm.getField().addCropRow(row5);
    }

    private void establishTheChickenCoops() {
        ChickenCoop coop1 = new ChickenCoop();
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        Chicken chicken3 = new Chicken();
        Chicken chicken4 = new Chicken();
        coop1.addChickenToCoop(chicken1);
        coop1.addChickenToCoop(chicken2);
        coop1.addChickenToCoop(chicken3);
        coop1.addChickenToCoop(chicken4);

        ChickenCoop coop2 = new ChickenCoop();
        Chicken chicken5 = new Chicken();
        Chicken chicken6 = new Chicken();
        Chicken chicken7 = new Chicken();
        Chicken chicken8 = new Chicken();
        coop2.addChickenToCoop(chicken5);
        coop2.addChickenToCoop(chicken6);
        coop2.addChickenToCoop(chicken7);
        coop2.addChickenToCoop(chicken8);

        ChickenCoop coop3 = new ChickenCoop();
        Chicken chicken9 = new Chicken();
        Chicken chicken10 = new Chicken();
        Chicken chicken11 = new Chicken();
        Chicken chicken12 = new Chicken();
        coop3.addChickenToCoop(chicken9);
        coop3.addChickenToCoop(chicken10);
        coop3.addChickenToCoop(chicken11);
        coop3.addChickenToCoop(chicken12);

        ChickenCoop coop4 = new ChickenCoop();
        Chicken chicken13 = new Chicken();
        Chicken chicken14 = new Chicken();
        Chicken chicken15 = new Chicken();
        coop4.addChickenToCoop(chicken13);
        coop4.addChickenToCoop(chicken14);
        coop4.addChickenToCoop(chicken15);

        froilansFarm.getChickenCoopsOnFarm().add(coop1);
        froilansFarm.getChickenCoopsOnFarm().add(coop2);
        froilansFarm.getChickenCoopsOnFarm().add(coop3);
        froilansFarm.getChickenCoopsOnFarm().add(coop4);
    }

    private void establishTheStables() {

        Stable stable1 = new Stable();
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Horse horse3 = new Horse();
        Horse horse4 = new Horse();
        stable1.addHorseToStable(horse1);
        stable1.addHorseToStable(horse2);
        stable1.addHorseToStable(horse3);
        stable1.addHorseToStable(horse4);

        Stable stable2 = new Stable();
        Horse horse5 = new Horse();
        Horse horse6 = new Horse();
        Horse horse7 = new Horse();
        stable2.addHorseToStable(horse5);
        stable2.addHorseToStable(horse6);
        stable2.addHorseToStable(horse7);

        Stable stable3 = new Stable();
        Horse horse8 = new Horse();
        Horse horse9 = new Horse();
        Horse horse10 = new Horse();
        stable3.addHorseToStable(horse8);
        stable3.addHorseToStable(horse9);
        stable3.addHorseToStable(horse10);

        froilansFarm.getStablesOnFarm().add(stable1);
        froilansFarm.getStablesOnFarm().add(stable2);
        froilansFarm.getStablesOnFarm().add(stable3);
    }




}
