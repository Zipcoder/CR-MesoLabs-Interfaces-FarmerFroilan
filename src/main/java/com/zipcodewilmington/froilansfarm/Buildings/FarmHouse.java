package com.zipcodewilmington.froilansfarm.Buildings;

import com.zipcodewilmington.froilansfarm.Person.Person;

import java.util.ArrayList;

public class FarmHouse {

    ArrayList<Person> people = new ArrayList<>();

    public void addPerson(Person person) {
        this.people.add(person);
    }

    public ArrayList<Person> getPeople() {
        return this.people;
    }

}
