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
    public static final int fDEFAULT_NUMBER_OF_CROPS = 10;
    List<Crop> crops;

    public CropRow() {
        this(fDEFAULT_NUMBER_OF_CROPS);
    }

    public CropRow(int numberOfCrops) {
        crops = new ArrayList<>(numberOfCrops);
    }

    public void sow(Crop crop) {
        crops.add(crop);
    }
}
