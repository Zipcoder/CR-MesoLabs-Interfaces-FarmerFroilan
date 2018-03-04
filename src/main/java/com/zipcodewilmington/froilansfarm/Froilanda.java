package com.zipcodewilmington.froilansfarm;

public class Froilanda extends  Person implements Pilot {

    public void fly(AirCraft airCraftToPilot) {
        System.out.println("Froilanda boards the aircraft");
        airCraftToPilot.fly();
    }
}
