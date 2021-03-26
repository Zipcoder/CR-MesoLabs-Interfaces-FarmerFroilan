package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Persons.Person;

import java.util.ArrayList;

public class FarmHouse extends Housing<Person> {
    ArrayList<Person> house = new ArrayList<Person>();

    public FarmHouse() {}

    public FarmHouse(int numOfPeople, Person person) {
        for (int i = 0; i < numOfPeople; i++) {
            store(person);
        }
    }

    public void movedOut (Person person) {
        house.remove(person);
    }

    @Override
    public void store(Person person) {
        house.add(person);
    }

    @Override
    public int size() {
        return house.size();
    }
}
