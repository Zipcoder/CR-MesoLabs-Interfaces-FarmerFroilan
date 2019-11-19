package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.vehicles.Aircraft;

public class Pilot extends Person {
    Aircraft aircraft;


    Pilot(String name) {
        super(name);
    }

    public void mount(Rideable rideable)    {
        this.aircraft.fly();

    }


    public void disMount(Rideable rideable) {   //TODO sets aircraft's current status

    }





}
