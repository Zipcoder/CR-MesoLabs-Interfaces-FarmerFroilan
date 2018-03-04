package com.zipcodewilmington.froilansfarm.Crops;

import java.util.ArrayList;

public class Field <T extends Crop>{

    protected ArrayList<CropRow> rows;

    public Field(){
        this.rows = new ArrayList<>();
    }

    public ArrayList<CropRow> getRowsList(){
        return this.rows;
    }

    public CropRow getRow(int index){
        return this.rows.get(index);
    }

    public void plantCrop (T crop){
        this.rows.add(new CropRow(crop));
    }

    public void plantCrop(T... crops){
        for (T crop:crops){
            this.plantCrop(crop);
        }
    }

}
