package com.zipcodewilmington.froilansfarm.Plants;

public class Field {

    private CropRow[] cropRows = new CropRow[5];

    public Field() {
        this.cropRows[0] = new CropRow();
        this.cropRows[1] = new CropRow();
        this.cropRows[2] = new CropRow();
        this.cropRows[3] = new CropRow();
        this.cropRows[4] = new CropRow();
    }

    public CropRow[] getCropRows() {
        return cropRows;
    }

    // Temporarily noted out to test Field

    /*
    public Field(int fieldSize) {
        this.cropRows = new CropRow[fieldSize];
    }
    */

}
