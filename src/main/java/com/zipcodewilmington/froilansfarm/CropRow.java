package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class CropRow {
    private ArrayList<Crop> crops = new ArrayList<Crop>();

    public void addCrop (Crop crop){
        crops.add(crop);
    }
}
