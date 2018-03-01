package com.zipcodewilmington.froilansfarm.crop;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Field {

    private static CropRow[] cropRowsInField = new CropRow[5];

    public static CropRow[] getCropRowsInField() {
        return cropRowsInField;

    }
}
