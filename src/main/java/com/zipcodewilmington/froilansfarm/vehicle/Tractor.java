package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

public class Tractor extends Vehicle implements FarmVehicle {

    public Tractor(String name){
        super(name);
    }

    public void operate(){
        harvest();
    }
    //will be passed Crop parameter
    public void harvest(){}
    public void makeNoise() {
        System.out.println("Dumb tractor noises");
    }

    @Override
    public String toString(){
        return "Tractor";
    }
}
