package com.zipcodewilmington.froilansfarm.FarmBuildings;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Field {

    public ArrayList<CropRow> cropRow;

    public Field(CropRow... cropRows){
        this.cropRow = new ArrayList<>();
        for (CropRow miniCropRow : cropRows){
            this.cropRow.add(miniCropRow);
        }
    }

    public CropRow getCropRow(int i) {
        return this.cropRow.get(i);
    }

    public ArrayList<CropRow> getEntireCropRow() {
        return this.cropRow;
    }
}
