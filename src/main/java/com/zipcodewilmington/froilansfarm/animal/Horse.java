package com.zipcodewilmington.froilansfarm.animal;


import com.zipcodewilmington.froilansfarm.Rideable;
import com.zipcodewilmington.froilansfarm.person.Person;

public class Horse extends Animal implements Rideable {
    private Person rider;

    public Person getRider() {
        return rider;
    }

    public void setRider(Person rider) {
        this.rider = rider;
    }


    public String makeNoise() {
        return "Neigh";
    }

    public void eat() {
    }
}
