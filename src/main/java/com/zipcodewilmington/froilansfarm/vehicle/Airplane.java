package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.vehicle.Vehicle;

public abstract class Airplane extends Vehicle {
    public boolean inAir=false;

    public Airplane(String name){
        super(name);
    }

    public void fly(){
        inAir=true;
        System.out.println("We in the sky baby!");
    }
    public void land(){
        inAir=false;
        System.out.println("Back on solid ground!");
    }

}
