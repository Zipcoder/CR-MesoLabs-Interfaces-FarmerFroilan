package com.zipcodewilmington.froilansfarm.farm.field;

import java.util.ArrayList;

public class Field {
    private ArrayList<CropRow> cropRows;

    public Field (CropRow ... rowsToAdd){
        this.cropRows = new ArrayList<>(0);
        for(CropRow cr: rowsToAdd){
            this.cropRows.add(cr);
        }

    }

    public CropRow getRow(CropRow rowToGet){

        return this.cropRows.get(this.cropRows.indexOf(rowToGet));
    }

    public ArrayList<CropRow> getField(){

        return this.cropRows;
    }


}
