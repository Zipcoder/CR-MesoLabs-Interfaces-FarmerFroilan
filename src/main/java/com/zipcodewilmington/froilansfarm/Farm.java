package com.zipcodewilmington.froilansfarm;


import com.zipcodewilmington.froilansfarm.AnimalStorage.AnimalStorage;
import com.zipcodewilmington.froilansfarm.AnimalStorage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.AnimalStorage.Stable;
import com.zipcodewilmington.froilansfarm.Baskets.Basket;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.Egg;
import com.zipcodewilmington.froilansfarm.Edibles.Potato;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.FieldRelated.*;
import com.zipcodewilmington.froilansfarm.PersonRelated.Farmer;
import com.zipcodewilmington.froilansfarm.PersonRelated.Pilot;
import com.zipcodewilmington.froilansfarm.VehicleRelated.CropDuster;
import com.zipcodewilmington.froilansfarm.VehicleRelated.Tractor;

import java.util.ArrayList;

public class Farm {
    private Meals meals = new Meals();
    //coops
    private ArrayList<ChickenCoop> coops;
    private ChickenCoop chickenCoop1;
    private ChickenCoop chickenCoop2;
    private ChickenCoop chickenCoop3;
    private ChickenCoop chickenCoop4;
    //stable
    private ArrayList<Stable> stables;
    private Stable stable1;
    private Stable stable2;
    private Stable stable3;
    //baskets
    //private ArrayList<Basket> baskets = new ArrayList<>();
    private Basket cornBasket;
    private Basket tomatoBasket;
    private Basket potatoBasket;
    private Basket eggBasket;
    //Farmer and Pilot
    private Farmer froilan;



    private Pilot froilanda;

    private FarmHouse farmhouse;
    //field and cropRows
    private Field field;
    private ArrayList<CropRow> cropRows;
    private CropRow cropRow1;
    private CropRow cropRow2;
    private CropRow cropRow3;
    private CropRow cropRow4;
    private CropRow cropRow5;



    //vehicles
    private CropDuster cropDuster;
    private Tractor tractor;
    private Tractor backupTractor;

//Constructor
    public Farm() {
        coops = new ArrayList<>();
        chickenCoop1 = new ChickenCoop();
        chickenCoop2 = new ChickenCoop();
        chickenCoop3 = new ChickenCoop();
        chickenCoop4 = new ChickenCoop();
        coops.add(chickenCoop1);
        coops.add(chickenCoop2);
        coops.add(chickenCoop4);
        coops.add(chickenCoop3);

        //stable
        stables = new ArrayList<>();
        stable1 = new Stable();
        stable2 = new Stable();
        stable3 = new Stable();
        stables.add(stable1);
        stables.add(stable2);
        stables.add(stable3);

        //baskets
        //ArrayList<Basket> baskets = new ArrayList<>();
        cornBasket = new Basket<EarCorn>();
        tomatoBasket = new Basket<Tomato>();
        potatoBasket = new Basket<Potato>();
        eggBasket = new Basket<Egg>();
        //Farmer and Pilot
        froilan = new Farmer();
        froilanda = new Pilot();

        farmhouse = new FarmHouse();
        field = new Field();
        cropRows = new ArrayList<>();
        cropRow1 = new CropRow();
        cropRow2 = new CropRow();
        cropRow3 = new CropRow();
        cropRow4 = new CropRow();
        cropRow5 = new CropRow();
        cropRows.add(cropRow1);
        cropRows.add(cropRow2);
        cropRows.add(cropRow3);
        cropRows.add(cropRow4);
        cropRows.add(cropRow5);

        cropDuster = new CropDuster();
        tractor = new Tractor();
        backupTractor = new Tractor();

         creationDay();
    }

    public void creationDay() {
        fillChickenCoop();
        fillStables();
        fillUpBaskets();
        filCropRows();

    }


    public void everyday() {
        feedChicken();
        feedHorse();
        eatFroilan();
        eatFroylanda();
        rideHorses();
        currentInventory();
    }
    public void filCropRows() {
        for (int i = 0; i < 5; i++) {
            cropRow1.add(new CornStalk());
            cropRow2.add(new TomatoPlant());
            cropRow3.add(new CornStalk());
            cropRow4.add(new PotatoPlant());
            cropRow5.add(new CornStalk());
            field.add(cropRow1);
            field.add(cropRow2);
            field.add(cropRow3);
            field.add(cropRow4);
            field.add(cropRow5);
        }

    }


    private void fillChickenCoop() {
        for (int i = 0; i < 4; i++) {
            chickenCoop1.add(new Chicken());
            chickenCoop2.add(new Chicken());
            chickenCoop3.add(new Chicken());
            chickenCoop4.add(new Chicken());
        }
    }

    private void fillStables() {
        for (int i = 0; i < 3; i++) {
            stable1.add(new Horse());
            stable2.add(new Horse());
            stable3.add(new Horse());
        }
        stable3.add(new Horse());
    }

    private void fillUpBaskets() {
        for (int i = 0; i < 1000; i++) {
            cornBasket.add(new EarCorn());
            potatoBasket.add(new Potato());
            tomatoBasket.add(new Tomato());
            eggBasket.add(new Egg());
        }
    }

    private void feedChicken() {

        for (int i = 0; i < chickenCoop1.animalCount(); i++) {
            cornBasket.remove(1);
        }
        for (int i = 0; i < chickenCoop2.animalCount(); i++) {
            cornBasket.remove(1);
        }
        for (int i = 0; i < chickenCoop3.animalCount(); i++) {
            cornBasket.remove(1);
        }
        for (int i = 0; i < chickenCoop4.animalCount(); i++) {
            cornBasket.remove(1);
        }
    }

    private void feedHorse() {
        for (int i = 0; i < stable1.animalCount(); i++) {
            cornBasket.remove(3);
        }
        for (int i = 0; i < stable2.animalCount(); i++) {
            cornBasket.remove(3);
        }
        for (int i = 0; i < stable3.animalCount(); i++) {
            cornBasket.remove(3);
        }
    }
    private void eatFroilan() {
        cornBasket.remove(1);
        tomatoBasket.remove(2);
        eggBasket.remove(5);
    }
    private void eatFroylanda() {
        cornBasket.remove(2);
        tomatoBasket.remove(1);
        eggBasket.remove(2);
    }

    private void rideHorses() {
        Integer coutner = 0;
        for (Stable s : stables
             ) {
            for (int i = 0; i < s.animalCount() ; i++) {
                if (s.get(i).getReady()) {
                    froilan.mount(s.get(i));
                    froilan.ride(s.get(i));
                    froilan.dismount(s.get(i));
                    s.get(i).setReady(false);
                }
                coutner++;
            }
        }
        System.out.println("Froilan rode " + coutner + " horses today.");
    }
    private void currentInventory(){
        System.out.println("num of eggs " + getEggBasket().size());
        System.out.println("num of corn " + getCornBasket().size());
        System.out.println("num of potato " + getPotatoBasket().size());
        System.out.println("num of tomato " + getTomatoBasket().size());

    }

    public Farmer getFroilan() {
        return froilan;
    }

    public Field getField() {
        return field;
    }

    public Basket getCornBasket() {
        return cornBasket;
    }

    public Basket getTomatoBasket() {
        return tomatoBasket;
    }

    public Basket getPotatoBasket() {
        return potatoBasket;
    }

    public Basket getEggBasket() {
        return eggBasket;
    }

    public Tractor getTractor() {
        return tractor;
    }

    public ArrayList<CropRow> getCropRows() {
        return cropRows;
    }
    public Pilot getFroilanda() { return this.froilanda; }
    public CropDuster getCropDuster() { return this.cropDuster; }
}
