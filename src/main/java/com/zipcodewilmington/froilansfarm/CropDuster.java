package com.zipcodewilmington.froilansfarm;

public class CropDuster extends AirCraft{

    @Override
    public void fly() {
        fertilize();
    }

    public void fertilize(){

        System.out.println("crop duster is fertilizing");
    }
}
