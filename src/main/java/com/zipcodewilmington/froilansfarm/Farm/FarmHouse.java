package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Person;
import java.util.ArrayList;

public class FarmHouse <T extends Person>{
    protected ArrayList<T> people;

    public FarmHouse(){
        people = new ArrayList<T>();
    }

    public FarmHouse(T... persons){
        people = new ArrayList<T>();
        for (T person:persons) {
            this.addPerson(person);
        }
    }

    public void addPerson(T person){
        this.people.add(person);
    }

    public void removePerson(T person){
        this.people.remove(person);
    }
}
