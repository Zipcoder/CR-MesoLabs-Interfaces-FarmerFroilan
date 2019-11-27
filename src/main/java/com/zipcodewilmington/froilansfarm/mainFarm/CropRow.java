package com.zipcodewilmington.froilansfarm.mainFarm;

import com.zipcodewilmington.froilansfarm.crops.Crop;

import java.util.List;

public class CropRow<E extends Crop> {

    private E CropType;
    private List<E> CropRowContents;


    public CropRow(E cropType) {
        CropType = cropType;
    }


    public List<E> getCropRowContents() {
        return CropRowContents;
    }

    public void setCropRowContents(List<E> cropRowContents) {
        CropRowContents = cropRowContents;
    }

}
