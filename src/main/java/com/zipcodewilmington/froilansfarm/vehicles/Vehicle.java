package com.zipcodewilmington.froilansfarm.vehicles;

import com.zipcodewilmington.froilansfarm.animals.people.Person;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Rideable;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Rider;

public class Vehicle implements Rideable, NoiseMaker {
    private Rider operator ;

    public String  makeNoise() {
        return null;
    }

    public void ride(Rider rider) {
        this.operator =  rider;
    }

    public void exitVehicle() {
        this.operator =  null;
    }

    public Rider getOperator()
    {
        return this.operator;
    }
}
