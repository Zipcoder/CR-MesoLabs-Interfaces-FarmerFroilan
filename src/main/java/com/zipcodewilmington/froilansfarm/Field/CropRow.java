package com.zipcodewilmington.froilansfarm.Field;

import java.util.ArrayList;

public class CropRow {

    private ArrayList<Crop> row = new ArrayList<Crop>();

    public void addCrop(Crop crop){
        row.add(crop);
    }

    public ArrayList<Crop> getCropRow(){
        return row;
    }

    public int getCropRowSize(){
        return row.size();
    }

}


