package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.person.Pilot;
import com.zipcodewilmington.froilansfarm.vehicle.Vehicle;

public abstract class Airplane extends Vehicle {
    public boolean inAir=false;
    public boolean properPilot=false;

    public Airplane(String name){
        super(name);
    }

    public void fly(){
        if (properPilot){
            inAir=true;
            System.out.println("We in the sky baby!");
        }

    }
    public void land(){
        inAir=false;
        properPilot=false;
        System.out.println("Back on solid ground!");
    }

    public void pilotOnBoard(Pilot x){
        properPilot=true;
    }
    public void pilotNotOnBoard(Pilot x){
        properPilot=false;
    }

}
