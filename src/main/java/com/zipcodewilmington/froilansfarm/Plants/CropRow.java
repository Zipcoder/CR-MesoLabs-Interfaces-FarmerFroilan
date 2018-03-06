package com.zipcodewilmington.froilansfarm.Plants;

import java.util.ArrayList;

public class CropRow {

    private ArrayList<Crop> cropArrayList;

    public CropRow() {
        this.cropArrayList = new ArrayList<>();
    }

    public ArrayList<Crop> getCropArrayList() {
        return this.cropArrayList;
    }

}
