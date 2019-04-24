package com.zipcodewilmington.froilansfarm.Vehicles;

public abstract class Aircraft extends Vehicle {

    boolean isFlying = false;

    public void fly(){
        setHasRider();
        this.isFlying = true;
    }

    public void notFlying(){
        if(this.isFlying == true){
            this.isFlying = false;
        }
    }
    public String makeNoise() {
        return "Whoosh!";
    }

}
