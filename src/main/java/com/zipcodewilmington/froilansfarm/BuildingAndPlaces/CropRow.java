package com.zipcodewilmington.froilansfarm.BuildingAndPlaces;

import com.zipcodewilmington.froilansfarm.FoodAndAnimals.Crop;

import java.util.ArrayList;

public class CropRow{
    private ArrayList<Crop> crops = new ArrayList<Crop>();
    private int cropRowID;

    public CropRow(int id){
        this.cropRowID = id;
    }

    public void addCrop(Crop crop, int numberOfCropsInOnwRow){
        for(int i = 0; i < numberOfCropsInOnwRow; i ++) {
            Crop cropBeingMade = crop;
            crops.add(cropBeingMade);
        }
    }

    public void rowReset(){
        crops.clear();
    }

    public void removeCrop(){
        crops.remove(crops.get(crops.size()-1));
    }

    public ArrayList<Crop> getCrops() {
        return crops;
    }

    public int getCropRowID() {
        return cropRowID;
    }
}
