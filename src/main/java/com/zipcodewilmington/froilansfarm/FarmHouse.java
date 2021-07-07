package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.PersonRelated.Person;

import java.util.ArrayList;
import java.util.List;

public class FarmHouse {
    private List <Person> farmHouse;

    public FarmHouse() {

        farmHouse = new ArrayList<>();
    }
    public void add(Person person){
        farmHouse.add(person);
    };
    public void remove(Person person){
        farmHouse.remove(person);
    };
    public Integer size(){
        return farmHouse.size();
    };

}
