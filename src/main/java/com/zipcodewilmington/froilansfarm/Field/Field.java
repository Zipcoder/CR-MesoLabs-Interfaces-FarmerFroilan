package com.zipcodewilmington.froilansfarm.Field;

import java.util.ArrayList;

public class Field {

    private final ArrayList<CropRow> cropRows = new ArrayList<CropRow>();


    public void addCropRow(CropRow row){
        cropRows.add(new CropRow());
    }

    public ArrayList<CropRow> getAllRows(){
        return cropRows;
    }

    public CropRow getSingleCropRow(int index){

        return this.cropRows.get(index);
    }

}
