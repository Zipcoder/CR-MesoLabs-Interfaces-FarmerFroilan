package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    private Field field;
    private FarmHouse farmHouse;
    private CropDuster cropDuster;
    private Tractor tractor;
    private Stable stableOne;
    private Stable stableTwo;
    private Stable stableThree;
    private ChickenCoop firstChickenCoop;
    private ChickenCoop secondChickenCoop;
    private ChickenCoop thirdChickenCoop;
    private ChickenCoop fourthChickenCoop;
    private CropRow firstCropRow;
    private CropRow secondCropRow;
    private CropRow thirdCropRow;
    private CropRow fourthCropRow;
    private CropRow fifthCropRow;


    Farm() {
        this.field = new Field();
        this.farmHouse = new FarmHouse();
        this.tractor = new Tractor();
        this.cropDuster = new CropDuster();
        this.firstChickenCoop = new ChickenCoop();
        this.secondChickenCoop = new ChickenCoop();
        this.thirdChickenCoop = new ChickenCoop();
        this.fourthChickenCoop = new ChickenCoop();
        this.firstCropRow = new CropRow();
        this.secondCropRow = new CropRow();
        this.thirdCropRow = new CropRow();
        this.fourthCropRow = new CropRow();
        this.fifthCropRow = new CropRow();
        this.stableOne = new Stable();
        this.stableTwo = new Stable();
        this.stableThree = new Stable();
        populateField();
        populateChickenCoop();
        populateStables();
    }

    public void populateField() {

        firstCropRow.add(new CornStalk());
        secondCropRow.add(new TomatoPlant());
        thirdCropRow.add(new OtherVegetation());
        fourthCropRow.add(new OtherVegetation());
        fifthCropRow.add(new OtherVegetation());

        this.field.add(firstCropRow);
        this.field.add(secondCropRow);
        this.field.add(thirdCropRow);
        this.field.add(fourthCropRow);
        this.field.add(fifthCropRow);
    }

    public void populateChickenCoop() {
        for (int i = 0; i < 4; i++) {
            firstChickenCoop.add(AnimalFactory.createChicken());
            secondChickenCoop.add(AnimalFactory.createChicken());
            thirdChickenCoop.add(AnimalFactory.createChicken());
        }
        for (int i = 0; i < 3; i++) {
            fourthChickenCoop.add(AnimalFactory.createChicken());
        }
    }

    public void populateStables() {
        for(int i = 0; i < 3; i++){
           stableOne.add(AnimalFactory.createHorse());
           stableTwo.add(AnimalFactory.createHorse());
           stableThree.add(AnimalFactory.createHorse());
        }
           stableThree.add(AnimalFactory.createHorse());
    }


    public Field getField() {
        return this.field;
    }

    public CropDuster getCropDuster(){
        return this.cropDuster;
    }

    public Tractor getTractor(){
        return this.tractor;
    }

    public Stable getStableOne() {
        return this.stableOne;
    }

    public Stable getStableTwo(){
        return this.stableTwo;
    }

    public Stable getStableThree(){
        return this.stableThree;
    }

    public FarmHouse getFarmHouse() {
        return this.farmHouse;
    }

    public ChickenCoop getFirstChickenCoop(){
        return this.firstChickenCoop;
    }

    public ChickenCoop getSecondChickenCoop(){
        return this.secondChickenCoop;
    }

    public ChickenCoop getThirdChickenCoop(){
        return this.thirdChickenCoop;
    }

    public ChickenCoop getFourthChickenCoop(){
        return this.fourthChickenCoop;
    }


    public ArrayList<Horse> getHorses() {

        ArrayList<Horse> horses = new ArrayList<Horse>();

        horses.addAll(stableOne.getList());
        horses.addAll(stableTwo.getList());
        horses.addAll(stableThree.getList());

        return horses;
    }


}


