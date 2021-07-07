package com.zipcodewilmington.froilansfarm.VehicleRelated;

import com.zipcodewilmington.froilansfarm.FieldRelated.CropRow;

public class CropDuster extends Vehicle implements Aircraft {
    public Boolean fly() {
        return true;
    }
    public void fertilize(CropRow cropRow) {
        cropRow.fertilize();
        System.out.println(cropRow.getCrop().getType()+ " has been fertilized");

    }

    public String makeNoise() {
        return "vooooom";

    }
}
