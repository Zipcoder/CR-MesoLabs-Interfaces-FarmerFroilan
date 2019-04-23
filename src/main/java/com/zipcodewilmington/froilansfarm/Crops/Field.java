package com.zipcodewilmington.froilansfarm.Crops;

import java.util.ArrayList;

public class Field {

    ArrayList<CropRow> rowsOfCrops = new ArrayList<>();

    public void addRowsOfCrops(CropRow cropRow) {
        rowsOfCrops.add(cropRow);
    }

    public ArrayList<CropRow> getRowsOfCrops() {
        return this.rowsOfCrops;
    }

}
