package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public abstract class Aircraft implements FarmVehicle {

    private boolean isFlying;

    void fly() {
        if(isFlying == false) {
            isFlying = true;
        } else {
            System.out.println("Already flying");
        }
    }

    void land() {
        if(isFlying == true) {
            isFlying = false;
        } else {
            System.out.println("Already landed");
        }
    }

    boolean getIsFlying() {
        return this.isFlying;
    }

}
