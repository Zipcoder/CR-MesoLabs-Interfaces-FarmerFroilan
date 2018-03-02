package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.People.Person;
import com.zipcodewilmington.froilansfarm.Plants.CropRow;
import com.zipcodewilmington.froilansfarm.Vehicles.AirCraft;

public class Pilot extends Person {

    public Pilot(String name) {
        super(name);
    }

    @Override
    public String makeNoise() {
        return "I'm a pilot";
    }

    public void mount(AirCraft thingToMount) {
        thingToMount.mounted();
    }

    public void dismount(AirCraft thingToMount) {
        thingToMount.dismounted();
    }

    public void takeOff(AirCraft airCraft) {
        airCraft.takeOff();
    }

    public void land(AirCraft airCraft) {
        airCraft.land();
    }

    public String fertilizeRow(CropRow cropRow, AirCraft airCraft) {
        if (airCraft.inTheAir) {
            for (int i = 0; i < cropRow.cropArrayList.size(); i++) {
                cropRow.cropArrayList.get(i).fertilize();
            }
            return "Crops fertilized!";
        } else {
            return "We haven't taken off yet!";
        }
    }

    // rider specifically for aircraft

}
