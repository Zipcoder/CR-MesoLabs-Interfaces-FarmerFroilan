package com.zipcodewilmington.froilansfarm;

public class CropDuster extends FarmVehicle implements Aircraft {
    public void operate(Farm farm) {

    }

    public String makeNoise() {

        return "Woooosh";
    }

    public void fertilize(CropRow cropRow) {
        cropRow.setHasFertilized(true);
    }

    public void fly(Field field) {
        field.setFlyOverTheField(true);
        for(CropRow cropRow:field.getList()){
            fertilize(cropRow);
        }
    }
}
