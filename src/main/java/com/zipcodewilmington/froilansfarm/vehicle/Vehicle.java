package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.interfaces.Noisemaker;
import com.zipcodewilmington.froilansfarm.interfaces.Ridable;

public abstract class Vehicle implements Ridable, Noisemaker {
    String name;

    public Vehicle(String name){
        this.name = name;
    }


}
