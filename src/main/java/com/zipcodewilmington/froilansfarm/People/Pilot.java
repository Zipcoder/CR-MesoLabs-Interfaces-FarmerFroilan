package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.People.Person;
import com.zipcodewilmington.froilansfarm.Plants.CropRow;
import com.zipcodewilmington.froilansfarm.Vehicles.AirCraft;

public class Pilot extends Person {

    // Only the pilot can mount aircraft

    public Pilot(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return "I'm a pilot";
    }

    public void mount(AirCraft thingToMount) {
        if (!currentlyRidingSomething) {
            thingToMount.mounted();
            currentlyRidingSomething = true;
        }
        // Need to figure out how to make exclusive
    }

    public void dismount(AirCraft thingToMount) {
        if (currentlyRidingSomething) {
            thingToMount.dismounted();
            currentlyRidingSomething = false;
        }
    }

    public void takeOff(AirCraft airCraft) {
        airCraft.takeOff();
    }

    public void land(AirCraft airCraft) {
        airCraft.land();
    }

    public String fertilizeRow(CropRow cropRow, AirCraft airCraft) {
        if (airCraft.inTheAir) {
            for (int i = 0; i < cropRow.getCropArrayList().size(); i++) {
                cropRow.getCropArrayList().get(i).fertilize();
            }
            return "Crops fertilized!";
        } else {
            return "We haven't taken off yet!";
        }
    }

}
