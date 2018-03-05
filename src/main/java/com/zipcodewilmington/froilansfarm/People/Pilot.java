package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Pilot extends Person{
    private String name;

    public Pilot(){
        this.name = "";
    }

    public Pilot(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String makeNoise() {
        return "Is it a bird? Is it a plane? NO ITS ME (Explosion sound)!";
    }

    public void flightSequence(){

    }

    public boolean getIntoAircraft(){
        return false;
    }

    public boolean takeOff(){
        return false;
    }

    public boolean land(){
        return false;
    }

    public boolean getOutOfPlane(){
        return false;
    }



}
