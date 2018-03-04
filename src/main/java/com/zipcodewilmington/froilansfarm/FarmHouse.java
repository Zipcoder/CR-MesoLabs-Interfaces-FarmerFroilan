package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class FarmHouse{

    ArrayList<Person> peopleInFarmHouse;
    Person person;


    public FarmHouse(int numberOfPeople) {
        peopleInFarmHouse = new ArrayList<Person>();

        setNumberOFPeopleInFarmHouse(numberOfPeople);
    }

    public void setNumberOFPeopleInFarmHouse(int numberOFPeople){

        peopleInFarmHouse.clear();

        for(int i = 0; i < numberOFPeople; i++){
            peopleInFarmHouse.add(person);
        }
    }
    public void addPersonToFarmHouse(Person person){

        peopleInFarmHouse.add(person);
    }
}
