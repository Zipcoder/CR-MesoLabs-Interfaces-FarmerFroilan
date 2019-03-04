package com.zipcodewilmington.froilansfarm;

public class CropDuster implements FarmVehicle, Aircraft {

    private boolean isFlying = true;
    private boolean isMount = true;
    private boolean isDismount= false;


    public void fly() {
        if (isMount){
            isFlying = true;
        }
    }

    public void operate(Farm farm) {

    }

    public String makeNoise() {
        return "cough";
    }

    public void mount() {
        this.isMount = true;

    }

    public void dismount() {
        this.isDismount = true;

    }
}
