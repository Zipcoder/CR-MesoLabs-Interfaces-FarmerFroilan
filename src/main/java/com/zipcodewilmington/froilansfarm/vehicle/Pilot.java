package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.plants.CropRow;
import com.zipcodewilmington.froilansfarm.person.Person;

public class Pilot  {
    Person thePilot;

    public Pilot(Person thePilot) {
        this.thePilot = thePilot;
    }

    public void fly (Aircraft aircraft){
            aircraft.isFlying();

    }

    public void land(Pilot pilot){

    }
}
