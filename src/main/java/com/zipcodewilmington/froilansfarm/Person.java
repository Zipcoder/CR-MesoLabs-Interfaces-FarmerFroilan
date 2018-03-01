package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Interfaces.Animal;

public abstract class Person implements Animal {
    protected String name;
    protected int calories;

    public Person(String name){
        this.name = name;
    }

    public Person(){
        this.name = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

}
