package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class CropRow {
    private ArrayList<Crop> crops = new ArrayList<Crop>();

    public ArrayList<Crop> getCrops() {
        return crops;
    }

    public void setCrops(ArrayList<Crop> crops) {
        this.crops = crops;
    }

    public void addCrop (Crop crop){
        crops.add(crop);
    }
}
