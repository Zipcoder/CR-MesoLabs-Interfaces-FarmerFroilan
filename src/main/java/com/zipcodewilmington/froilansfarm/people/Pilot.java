package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.vehicles.Aircraft;

public class Pilot extends Person {
    Aircraft aircraft;


    Pilot(String name) {
        super(name);
    }

    public void mount(Aircraft aircraft)    {
        this.aircraft.fly();

    }


    public void disMount(Aircraft aircraft) {   //need a method to stop flying in aircraft.

    }





}
