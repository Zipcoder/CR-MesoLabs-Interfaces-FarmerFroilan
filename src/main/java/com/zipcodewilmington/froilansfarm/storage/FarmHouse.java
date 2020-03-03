package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.people.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FarmHouse implements Storage<Person>{
    private List<Person> house;

    public FarmHouse(){
        house = new ArrayList<Person>();
    }

    public FarmHouse(Person... people){
        this();
        Collections.addAll(house, people);
    }

    public Boolean add(Person peopleToAdd) {
        if(!house.contains(peopleToAdd)){
            house.add(peopleToAdd);
            return true;
        }else
            return false;
    }

    public Boolean remove(Person peopleToRemove) {
        if(house.contains(peopleToRemove)){
            house.remove(peopleToRemove);
            return true;
        }else
            return false;
    }

    public Integer size() {
        return house.size();
    }
}
