package com.zipcodewilmington.froilansfarm.Plants;

public class Field {

    private CropRow[] cropRows;

    public CropRow[] getCropRows() {
        return cropRows;
    }

    public Field(int fieldSize) {
        this.cropRows = new CropRow[fieldSize];
    }

}
