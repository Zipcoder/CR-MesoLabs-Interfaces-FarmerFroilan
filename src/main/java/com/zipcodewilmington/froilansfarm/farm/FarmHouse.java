package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.person.Person;

import java.util.ArrayList;

public class FarmHouse {

    private final ArrayList<Person> peopleLivingInFarmHouse = new ArrayList<Person>();

    public ArrayList<Person> getPeopleLivingInFarmHouse() {
        return peopleLivingInFarmHouse;
    }

    public void startOfDayReset(){
        for (Person person: peopleLivingInFarmHouse) {
            person.startOfDayReset();
        }
    }
}
