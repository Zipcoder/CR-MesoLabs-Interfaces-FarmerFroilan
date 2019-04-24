package com.zipcodewilmington.froilansfarm.Crops;

import java.util.ArrayList;

public class CropRow <T extends Crop> {

    private T crops;

    ArrayList<T> cropRow = new ArrayList<T>();

    public T getCrops() {
        return crops;
    }

    public CropRow(T crop){
        this.crops = crop;
    }

    public ArrayList<T> getCropsInRow() {
        //dont use for field
        return cropRow;
    }


}
