package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Person.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/1/18
 */
public class FarmHouse {
    private static final int fDEFAULT_CAPACITY = 2;
    List<Person> people;

    public FarmHouse() {
        people = new ArrayList<>(fDEFAULT_CAPACITY);
    }

    public FarmHouse(Person... e) {
        people = new ArrayList<>(Arrays.asList(e));
    }

    public void enter(Person p) {
        people.add(p);
    }

    public Person getPerson(String name) {
        for (Person p : people) {
            if (p.getName().equalsIgnoreCase(name))
                return p;
        }
        return null;
    }
}
