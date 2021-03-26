package com.zipcodewilmington.froilansfarm;

public class Tractor extends Vehicle implements FarmVehicle{
    public void operate(){
        harvest();
    }
    //will be passed Crop parameter
    public void harvest(){}
    public void makeNoise() {
        System.out.println("Dumb tractor noises");
    }
}
