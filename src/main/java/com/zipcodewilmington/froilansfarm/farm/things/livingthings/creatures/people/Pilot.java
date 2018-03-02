package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people;

import com.zipcodewilmington.froilansfarm.farm.things.Rideable;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Edible;
import com.zipcodewilmington.froilansfarm.farm.things.vehicles.Aircraft;

public class Pilot extends Person implements Rider {

    public Pilot(String name) {
        super(name);
    }

    public void flyAircraft(Aircraft plane){
        plane.fly();

    }

    public void landAircraft(Aircraft plane){
        plane.land();

    }

    public String makeNoise() {
        return "Talk to me Goose";
    }

    public void mount(Rideable ride) {
        ride.getOn();

    }

    public void dismount(Rideable ride) {
        ride.getOff();

    }

}
