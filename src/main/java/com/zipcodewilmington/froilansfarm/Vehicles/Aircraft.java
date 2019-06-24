package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Animal.NoiseMaker;

public class Aircraft implements FarmVehicle, Flyable,Driveable,Vehicle, NoiseMaker {
    public boolean isFarmVehicle() {
        return true;
    }

    public void farmoperation(){
        System.out.println("I operate on farms");
    }
    public void ride(){
        System.out.println("You can ride");
    }
    public boolean canFly() {
        return true;
    }

    public boolean vehicleRideable() {
        return true;
    }

    public boolean isDriveable() {
        return true;
    }

    public boolean operate() {
        return true;
    }


    public String makeNoise() {
        return null;
    }

    public boolean makesNoise() {
        return true;
    }



    public boolean isMounted() {
        return false;
    }

    public void setMounted(boolean mounted) {

    }

    public boolean operatingVehicle() {
        return false;
    }

    public void setOperateVehicle(boolean operating) {

    }

    public boolean flyingAirCraft() {
        return false;
    }

    public void setFlyAirCraft(boolean flying) {

    }
}
