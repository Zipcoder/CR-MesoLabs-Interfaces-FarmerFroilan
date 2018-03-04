package com.zipcodewilmington.froilansfarm.Plants;

import java.util.ArrayList;

public class CropRow {

    private ArrayList<Crop> cropArrayList = new ArrayList<Crop>();

    public CropRow() {
        TomatoPlant tomatoPlant = new TomatoPlant();
        acceptPlant(tomatoPlant);
    }

    public ArrayList<Crop> getCropArrayList() {
        return cropArrayList;
    }

    public void acceptPlant(Crop crop) {
        getCropArrayList().add(crop);
    }

}
