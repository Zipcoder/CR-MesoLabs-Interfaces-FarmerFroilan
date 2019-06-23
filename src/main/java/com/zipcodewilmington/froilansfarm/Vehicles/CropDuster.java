package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Animal.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.Tomato;

public class CropDuster implements FarmVehicle, Vehicle, NoiseMaker, Flyable {

    public boolean isFarmVehicle() {
        return true;
    }

    public boolean canFly() {
        return true;
    }

    public boolean makesNoise() {
        return true;
    }

    public boolean operate() {
        return true;
    }

    public CropRow fertilize(CropRow cropRow){
        cropRow.fertilize();
        return cropRow;//croprow method is fetilized true
    }
//    public CropRow fertilize(CropRow<CucumberPlant> cropRow){
//        cropRow.Fertilize();
//        return cropRow;//croprow method is fetilized true
//    }
//    public CropRow fertilize(CropRow<StringBeanPlant> cropRow){
//        cropRow.Fertilize();
//        return cropRow;//croprow method is fetilized true
//    }
//    public CropRow fertilize(CropRow<CornStalk> cropRow){
//        cropRow.Fertilize();
//        return cropRow;//croprow method is fetilized true
//    }

    public boolean fertilized(CropRow cropRow) {
       cropRow.fertilize();
        return true;
    }
}