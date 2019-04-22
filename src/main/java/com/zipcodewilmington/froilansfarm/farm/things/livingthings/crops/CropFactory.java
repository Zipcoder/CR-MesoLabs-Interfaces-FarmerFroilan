package com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops;

public class CropFactory {

    public static Crop createCrop(CropType cropToCreate){

        switch(cropToCreate){
            case CORNSTALK:
                return new CornStalk();

            case TOMATOPLANT:
                return new TomatoPlant();

            default:
                return new ArbitrayVegetation();
        }

    }

}
