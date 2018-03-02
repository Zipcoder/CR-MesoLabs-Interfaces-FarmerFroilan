package com.zipcodewilmington.froilansfarm.person;

import com.zipcodewilmington.froilansfarm.interfaces.Rider;


public class Pilot extends Person implements Rider {

    public Pilot() {
        this.name = "Froilanda";
    }

    public String makeNoise() {
        return "I'm the best pilot ever!";
    }

}
