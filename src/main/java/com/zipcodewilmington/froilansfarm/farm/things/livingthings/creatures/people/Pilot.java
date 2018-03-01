package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people;

import com.zipcodewilmington.froilansfarm.farm.things.Rideable;
import com.zipcodewilmington.froilansfarm.farm.things.vehicles.Aircraft;

public class Pilot extends Person implements Rider {

    public Pilot(String name) {
        super(name);
    }

    public void flyAircraft(Aircraft plane){

    }

    public String makeNoise() {
        return null;
    }

    public void mount(Rideable ride) {

    }

    public void dismount(Rideable ride) {

    }
}
