package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Vehicles.Aircraft;

public class Pilot extends Person{

    public Pilot(){
        this.name = "Froilanda";
    }
    @Override
    public String makeNoise(){
        return "Pilot noises";
    }
    public void eat(Edible edible){
        this.getFoodFed().add(edible);
    }
    public void flyDuster(Aircraft aircraft){
        aircraft.fly();
    }
    public void landDuster(Aircraft aircraft){
        aircraft.notFlying();
    }
}
