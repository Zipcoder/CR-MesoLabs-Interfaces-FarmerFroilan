package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class Pilot extends Person implements FarmVehicle{

    private String name;

    public Pilot(){
        this.name = "Froilanda";
    }

    public void operate() {

    }


    public void eat(Edible food) {
    }
}
