package com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops;

public class CropFactory {

    public static Crop createCrop(CropType cropToCreate){

        switch(cropToCreate){
            case CORN_STALK:
                return new CornStalk();

            case TOMATO_PLANT:
                return new TomatoPlant();

            default:
                return new ArbitrayVegetation();
        }

    }

}
