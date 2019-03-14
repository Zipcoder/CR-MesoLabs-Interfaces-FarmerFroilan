package com.zipcodewilmington.froilansfarm;


import java.util.ArrayList;

public class Froilan  extends Farmer{

    Farm FroilanFarm;

    ArrayList<FarmVehicle> farmVehicles;
    AirCraft airCraft;


    public void plant(Produce typeOfProduce) {
        plant(typeOfProduce);
    }

    public  Froilan(){



       final Field FroilanField =  new Field();


       //making crops
       FroilanField.addCropToCropRow(new CornStalk());
       FroilanField.addCropToCropRow(new TomatoPlant());
       FroilanField.addCropToCropRow(new TomatoPlant());
       FroilanField.addCropToCropRow(new CornStalk());
       FroilanField.addCropToCropRow(new CornStalk());

       //making coops
       ArrayList<ChickenCoop> chickenCoops = new ArrayList<ChickenCoop>();
       ChickenCoop chickenCoopOne = new ChickenCoop(5);
        ChickenCoop chickenCoopTwo = new ChickenCoop(5);
        ChickenCoop chickenCoopThree = new ChickenCoop(2);
        ChickenCoop chickenCoopFour = new ChickenCoop(3);

        chickenCoops.add(chickenCoopOne);
        chickenCoops.add(chickenCoopTwo);
        chickenCoops.add(chickenCoopThree);
        chickenCoops.add(chickenCoopFour);

        //making stables
        ArrayList<Stable> stables = new ArrayList<Stable>();
        Stable stableOne = new Stable(4);
        Stable stableTwo = new Stable(4);
        Stable stableThree = new Stable(2);

        stables.add(stableOne);
        stables.add(stableTwo);
        stables.add(stableThree);

        //adding to farmhouse
        ArrayList<FarmHouse> peopleInFarmHouse = new ArrayList<FarmHouse>();
        FarmHouse farmhouse = new FarmHouse(2);
        peopleInFarmHouse.add(farmhouse);


        //yay
        FroilanFarm = new Farm(new ArrayList<Field>(){{add(FroilanField);}}, stables, chickenCoops, new FarmHouse(2), peopleInFarmHouse);
        final FarmVehicle farmVehicleOne = new FarmVehicle();
        final FarmVehicle farmVehicleTwo = new FarmVehicle();

        this.farmVehicles = new ArrayList<FarmVehicle>(){
            {
            add(farmVehicleOne);
            add(farmVehicleTwo);
            }
        };

        this.airCraft = new CropDuster();

        FroilanFarm.farmHouse.addPersonToFarmHouse(this);


    }

    public AirCraft getAirCraft() {
        return airCraft;
    }
}
