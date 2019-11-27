package com.zipcodewilmington.froilansfarm.mainFarm;

import com.zipcodewilmington.froilansfarm.crops.Crop;

import java.util.List;

public class CropRow<E extends Crop> {

    private E cropType;
    private List<E> cropRowContents;


    public CropRow(E cropType, int howManyPlants) {
        cropType = cropType;
        plantCrops(cropType, howManyPlants);
    }

    public void plantCrops(E cropType, int howManyPlants){
        if(cropRowContents.isEmpty()) {
            setCropType(cropType);
            for (int i = 0; i < howManyPlants; i++) {
                cropRowContents.add(cropType);
            }
        }
    }

    public List<E> getHarvested() {
        List<E> returnThis = this.cropRowContents;
        cropRowContents.clear();
        return returnThis;
    }

    public List<E> getCropRowContents() {
        return cropRowContents;
    }

    public void setCropRowContents(List<E> cropRowContents) {
        cropRowContents = cropRowContents;
    }

    public E getCropType() {
        return cropType;
    }

    public void setCropType(E cropType) {
        this.cropType = cropType;
    }


}
