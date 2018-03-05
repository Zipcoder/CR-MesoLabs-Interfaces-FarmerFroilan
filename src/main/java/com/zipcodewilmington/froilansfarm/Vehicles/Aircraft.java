package com.zipcodewilmington.froilansfarm.Vehicles;

public abstract class Aircraft extends Vehicle{
    private boolean readyForTakeOff;
    private boolean isInTheAir;

    public boolean readyForFlight(){
        return false;
    }

    public boolean isInFlight(){ return false;}
}
