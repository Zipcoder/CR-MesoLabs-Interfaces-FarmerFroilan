package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Edible;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Moonshine;

import com.zipcodewilmington.froilansfarm.Rideable;

public class Pilot implements Rider, Person {
    Moonshine shine = new Moonshine();
    public String eat(Edible obj) {
        System.out.println("Yum, this food is tasty");
        return "Yum, this food is tasty";
    }

    public String makeNoise() {
        System.out.println("Everyone has oceans to fly, if they have the heart to do it. Is it reckless? Maybe. But what do dreams know of boundaries?");
        return "Everyone has oceans to fly, if they have the heart to do it. Is it reckless? Maybe. But what do dreams know of boundaries?";
    }

    public String mount(Rideable obj) {
        return null;
    }

    public String dismount(Rideable obj) {
        return null;
    }

    public boolean drankShine() {
        return true;
    }

    public boolean isDrunk(boolean drank){
        shine.removeGrowler(1);
        return true;
    }
}
