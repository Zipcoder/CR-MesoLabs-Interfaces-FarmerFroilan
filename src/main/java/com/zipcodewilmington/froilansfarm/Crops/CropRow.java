package com.zipcodewilmington.froilansfarm.Crops;

import java.util.ArrayList;

public class CropRow {

    ArrayList<Crop> cropsInRow = new ArrayList<>();

    public void addCrops(Crop crop) {
        cropsInRow.add(crop);
    }

    public ArrayList<Crop> getCropRow() {
        return this.cropsInRow;
    }
}
