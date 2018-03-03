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

    public void removeCrop(Crop aCrop) {
        aCropRow.remove(aCrop);
    }

    public void removeHarvestedCrops() {
        for (int i = 0; i < getCropRow().size(); i++) {
            if (getCropRow().get(i).getHasBeenHarvested()) {
                removeCrop(getCropRow().get(i));
            }
        }
    }

    public ArrayList<Crop> getCropRow() {
        return this.aCropRow;
    }

//    public ArrayList<Edible> harvestCropRow() {
//
//        ArrayList<Edible> harvestedEdibleObjects = new ArrayList<Edible>();
//
//        for (int i = 0; i < this.aCropRow.size(); i++) {
//            harvestedEdibleObjects.add(this.aCropRow.get(i).yield());
//        }
//        return harvestedEdibleObjects;
//    }

}
