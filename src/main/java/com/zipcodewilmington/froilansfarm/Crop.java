package com.zipcodewilmington.froilansfarm;

public class Crop extends CropRow{

    public Crop() {}

    public Crop(Produce typeOfProduce) {
        super(typeOfProduce);
    }

    public boolean hasBeenHarvested(){
        return false;
    }
    public boolean hasBeenFertilized(){
        return false;
    }


}
