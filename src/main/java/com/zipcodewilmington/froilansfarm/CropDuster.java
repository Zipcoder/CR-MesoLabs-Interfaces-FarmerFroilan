package com.zipcodewilmington.froilansfarm;

public class CropDuster extends Airplane implements FarmVehicle{
    public void operate(){
        fertilize();
    }
    //will be passed Crop parameter
    public void fertilize(){}

    public void makeNoise(){
        System.out.println("Stupid plane noise");
    }
}
