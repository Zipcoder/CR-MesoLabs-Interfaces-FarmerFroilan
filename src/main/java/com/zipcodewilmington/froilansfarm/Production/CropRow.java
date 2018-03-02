package com.zipcodewilmington.froilansfarm.Production;

import java.util.ArrayList;

public class CropRow {

    private ArrayList<Crop> aCropRow;

    public CropRow() {
        aCropRow = new ArrayList<Crop>();
    }

    public void addCrop(Crop aCrop) {
        aCropRow.add(aCrop);
    }

    public ArrayList<Crop> getCropRow() {
        return this.aCropRow;
    }

}
