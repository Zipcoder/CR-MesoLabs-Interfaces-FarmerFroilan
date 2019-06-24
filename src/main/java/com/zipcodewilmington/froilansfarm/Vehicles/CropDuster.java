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
    public void farmoperation(){
        System.out.println("call fertilize function");
    }
    public void ride(){
        System.out.println(" Hi I can ride");
    }
    public boolean isMounted() {
        return false;
    }
    public void setMounted(boolean mounted) {

    }

   // public boolean makeNoise(){return  true;}
   public String makeNoise(){return "";}
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
    public boolean flyingAirCraft() {
        return true;
    }

    public void setFlyAirCraft(boolean flying) {

    }
}