package com.zipcodewilmington.froilansfarm.Crops;

import java.util.ArrayList;

public class CropRow<T extends Crop> {

    public ArrayList<T> getCropRow() {
        return cropRow;
    }

    ArrayList<T> cropRow = new ArrayList<T>();


}
