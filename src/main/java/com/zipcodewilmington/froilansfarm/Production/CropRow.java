package com.zipcodewilmington.froilansfarm.Production;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.util.ArrayList;

public class CropRow {

    private ArrayList<Crop> aCropRow;

    public CropRow() {
        aCropRow = new ArrayList<Crop>();
    }

    public void addCrop(Crop aCrop) {
        aCropRow.add(aCrop);
    }

    public void removeCrop(Crop aCrop) {
        aCropRow.remove(aCrop);
    }

    public ArrayList<Crop> getCropRow() {
        return this.aCropRow;
    }

    public ArrayList<Edible> harvestCropRow() {

        ArrayList<Edible> harvestedEdibleObjects = new ArrayList<Edible>();

        for (int i = 0; i < this.aCropRow.size(); i++) {
            harvestedEdibleObjects.add(this.aCropRow.get(i).yield());
        }
        return harvestedEdibleObjects;
    }

}
