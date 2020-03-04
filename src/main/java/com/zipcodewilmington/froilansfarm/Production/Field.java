package com.zipcodewilmington.froilansfarm.Production;


import java.util.ArrayList;

public class Field {

    private ArrayList<CropRow> cropField;

    public Field() {
        cropField = new ArrayList<CropRow>();
    }

    public void addCropRow(CropRow aCropRow) {
        cropField.add(aCropRow);
    }

    public ArrayList<CropRow> getCropField() {
        return this.cropField;
    }

    public int getSize() {
        return getCropField().size();
    }


}
