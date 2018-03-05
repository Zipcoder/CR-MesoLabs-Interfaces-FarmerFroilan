package com.zipcodewilmington.froilansfarm.BuildingAndPlaces;

import com.zipcodewilmington.froilansfarm.FoodAndAnimals.Crop;

import java.util.ArrayList;

public abstract class Field {
    private ArrayList<ArrayList<Crop>> cropRows = new ArrayList<ArrayList<Crop>>();

    public void addRow(int rowNumber, Crop crop, int numberOfCropsInRow){
        CropRow cropRow = new CropRow(rowNumber);
        cropRow.addCrop(crop, numberOfCropsInRow);
        cropRows.add(cropRow.getCrops());
    }

    public void removeRow(int rowNumber){
        cropRows.remove(cropRows.get(rowNumber));
    }

}
