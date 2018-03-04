package com.zipcodewilmington.froilansfarm.Crop;

import java.util.ArrayList;
import java.util.List;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/1/18
 */
public class CropRow {
    private static final int fDEFAULT_NUMBER_OF_CROPS = 10;
    private int maxCrops;
    List<Crop> crops;

    public CropRow() {
        this(fDEFAULT_NUMBER_OF_CROPS);
    }

    public CropRow(int numberOfCrops) {
        maxCrops = numberOfCrops;
        crops = new ArrayList<>(numberOfCrops);
    }

    public void sow(Crop crop) {
        if (crops.size() < maxCrops)
            crops.add(crop);
    }

    public void fertilizeRow() {
        for (Crop crop : crops) {
            crop.setFertilized();
        }
    }

    public List<Crop> getCrops() {
        return crops;
    }
}
