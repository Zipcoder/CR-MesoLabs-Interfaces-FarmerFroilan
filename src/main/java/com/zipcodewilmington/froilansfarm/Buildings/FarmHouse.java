package com.zipcodewilmington.froilansfarm.Buildings;

import com.zipcodewilmington.froilansfarm.People.Person;

import java.util.ArrayList;

public class FarmHouse {

    private ArrayList<Person> farmers;

    public FarmHouse() {
        farmers = new ArrayList<Person>();
    }

    public ArrayList<Person> getFarmers() {
        return farmers;
    }

    public void addPersonToHouse(Person aPerson) {
        getFarmers().add(aPerson);
    }

    public void removePersonFromHouse(Person aPerson) {
        getFarmers().remove(aPerson);
    }

}
