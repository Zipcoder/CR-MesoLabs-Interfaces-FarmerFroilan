package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.mainFarm.Field;
import com.zipcodewilmington.froilansfarm.vehicles.Aircraft;

public class Pilot extends Person {
    Aircraft aircraft;
    Field field;


    Pilot(String name) {
        super(name);
    }

    public void mount(Aircraft aircraft)    {
        this.aircraft.fly(field);

    }


    public void disMount(Aircraft aircraft) {   //need a method to stop flying in aircraft.

    }





}
