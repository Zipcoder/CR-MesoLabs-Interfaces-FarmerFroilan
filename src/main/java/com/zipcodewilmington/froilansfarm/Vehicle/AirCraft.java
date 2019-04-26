package com.zipcodewilmington.froilansfarm.Vehicle;

public abstract class AirCraft extends Vehicle{

    private boolean flying = true;

    public void setFlying(){
        this.flying = true;
        setHasFarmerRiding();
    }

    public void setNotFlying(){
        this.flying = false;
    }

    public String makeNoise(){
        return "I'm Flaying in the air like an Aircraft!";
    }
}
