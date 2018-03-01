package com.zipcodewilmington.froilansfarm.farm.buildings;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people.Person;

import java.util.ArrayList;

public class FarmHouse {
    private ArrayList<Person> people;

    public FarmHouse(Person ... persons){
        this.people = new ArrayList<>(0);
        for (Person p : persons){
            this.people.add(p);
        }
    }

    public void addPerson(Person personToAdd){
        this.people.add(personToAdd);

    }

    public void removePerson(Person personToRemove){
        this.people.remove(personToRemove);
    }

    public Person getPerson(Person personToGet){

        return this.people.get(this.people.indexOf(personToGet));
    }

    public Person getPerson(int personIndex){
        return this.people.get(personIndex);
    }


    public Person getPerson(String name){
        for(Person p : this.people){
            if (p.getName().equals(name)) return p;
        }
        return null;
    }

    public int getFarmHouseSize(){
        return this.people.size();
    }

}
