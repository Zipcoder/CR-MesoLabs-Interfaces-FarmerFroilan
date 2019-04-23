package com.zipcodewilmington.froilansfarm.vehicle;

public abstract class AirCraft extends Vehicle{
    protected boolean isFlying = false;

    public void fly() {
        if (hasRider){
            this.isFlying = true;
        }
    }

    public void land() {
        if(isFlying){
            this.isFlying = false;
        }
    }
}
