package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Person implements NoiseMaker, Eater {

    String name;
    ArrayList<Person> people;

    public Person() {
        this.name = "";
        this.people = new ArrayList<Person>();
    }

    public void eat(Edible typeOfProduce) {
        eat(typeOfProduce);
    }
    @Override
    public String makeNoise() {
        return "Hiya";
    }

}
