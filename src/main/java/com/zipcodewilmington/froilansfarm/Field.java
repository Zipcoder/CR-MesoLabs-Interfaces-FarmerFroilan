package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Field {

     ArrayList<CropRow> cropRows;

     public Field(){

     }


    public void addCropToCropRow(Produce typeOfProduce){

        cropRows.add(new CropRow(typeOfProduce));
    }

}

