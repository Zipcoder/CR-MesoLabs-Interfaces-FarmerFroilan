package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animals.people.Person;

import java.util.ArrayList;

public class Farmhouse implements Storage<Person>{

    private ArrayList<Person> people;

    public Farmhouse(){
        people = new ArrayList<Person>();
    }


    public void add(Person person) {
        people.add(person);
    }

    public Person retrieveAtIndex(Integer index) {
        return this.people.get(index);
    }

    public Integer getCount() {
        return people.size();
    }
}
