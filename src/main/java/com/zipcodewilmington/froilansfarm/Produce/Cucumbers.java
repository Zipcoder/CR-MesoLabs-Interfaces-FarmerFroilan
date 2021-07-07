package com.zipcodewilmington.froilansfarm.Produce;

public class Cucumbers extends Bounty<Cucumber> {

    public Cucumber[] store() {
        Cucumber[] food = bounty.toArray(new Cucumber[0]);
        return food;
    }
}
