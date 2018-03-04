package com.zipcodewilmington.froilansfarm;

public class CropRow extends Field{

    public CropRow(){}

    Produce produce;

    public CropRow(Produce typeOfProduce){
        this.produce = typeOfProduce;
    }

    public void setProduce(Produce produce) {
        this.produce = produce;
    }
}
