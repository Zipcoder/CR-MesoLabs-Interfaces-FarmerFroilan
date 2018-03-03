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

        int counter = 0;

        for (int i = 0; i < getCropRow().size(); i++) {
            if (!getCropRow().get(i).getHasBeenHarvested()) {
                counter++;
            }
        }
        if (counter == 0) {
            getCropRow().clear();
        } else {
            System.out.println("Cannot clear crop row as there are " + counter + " unharvested crops.");
        }
    }

    public ArrayList<Crop> getCropRow() {
        return this.aCropRow;
    }

    public int getSize() {
        return getCropRow().size();
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
