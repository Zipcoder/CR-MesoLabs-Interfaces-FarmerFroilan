package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Field {
    private ArrayList<CropRow> cropRows = new ArrayList<CropRow>();

    public void addCrop (CropRow cropRow){
        cropRows.add(cropRow);
    }
}
