package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.storage.CropRows;

public class CropDuster extends FarmVehicle implements Aircraft{
    public String makeNoise() {
        return "Engine Roaring";
    }

    public void fertilize(CropRows CropRow) {
        // CropRow.fertilizeRow();
    }

}
