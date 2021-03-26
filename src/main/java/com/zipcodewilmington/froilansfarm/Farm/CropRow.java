package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Crops.Crop;

import java.util.ArrayList;


public class CropRow<E extends Crop> {
    public ArrayList<E> row;

    public CropRow() {
        row = new ArrayList<E>();
    }

    public CropRow(int numOfCrop, E crop) {
        row = new ArrayList<E>();
        for (int i = 0; i < numOfCrop; i++) {
            plantCrops(crop);
        }
    }

    public void plantCrops(E crop) {
        row.add(crop);
    }

    public int harvestCrop(E crop) {
        int numOfCrops = crop.howMuch();
        row.remove(crop);
        return numOfCrops;
    }


    public int cropsPerRow() {
        return row.size();
    }

    public Crop cropType (int num) {
        return row.get(num);
    }
}