package com.zipcodewilmington.froilansfarm.Plants;

import java.util.ArrayList;

public class CropRow {

    private final ArrayList<Crop> cropArrayList = new ArrayList<>();

    public CropRow() {
        getCropArrayList().add(0, null);
    }

    public ArrayList<Crop> getCropArrayList() {
        return this.cropArrayList;
    }

}
