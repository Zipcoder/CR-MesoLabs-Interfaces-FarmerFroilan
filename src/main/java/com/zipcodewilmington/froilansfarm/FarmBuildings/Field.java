package com.zipcodewilmington.froilansfarm.FarmBuildings;

import com.zipcodewilmington.froilansfarm.Crops.CropRow;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Field {

    CropRow[] cropRow = new CropRow[5];

    public Field(){
        cropRow[0] = new CropRow();
        cropRow[1] = new CropRow();
        cropRow[2] = new CropRow();
        cropRow[3] = new CropRow();
        cropRow[4] = new CropRow();
    }


    public CropRow[] getCropRow() {
        return cropRow;
    }


}
