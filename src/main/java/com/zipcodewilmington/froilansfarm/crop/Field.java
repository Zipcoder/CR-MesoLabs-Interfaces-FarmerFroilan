package com.zipcodewilmington.froilansfarm.crop;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Field {

    private CropRow[] cropRowsInField = new CropRow[5];

    public Field() {
        cropRowsInField[0] = new CropRow();
        cropRowsInField[1] = new CropRow();
        cropRowsInField[2] = new CropRow();
        cropRowsInField[3] = new CropRow();
        cropRowsInField[4] = new CropRow();
    }

    public CropRow[] getCropRowsInField() {

        return cropRowsInField;

    }
}
