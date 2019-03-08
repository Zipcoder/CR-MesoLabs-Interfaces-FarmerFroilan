package com.zipcodewilmington.froilansfarm.Crops;

public class CropRow<T extends Crop>{
    protected T crops;

    public CropRow(){}

    public CropRow(T crop){
        this.crops = crop;
    }

    public T getCrops() {
        return crops;
    }

    public void plantCrops(T crops) {
        this.crops = crops;
    }

    public void uproot(){
        this.crops = null;
    }

}
