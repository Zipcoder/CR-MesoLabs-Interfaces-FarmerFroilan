package com.zipcodewilmington.froilansfarm.Produce;

public class Eggs extends Bounty<Egg> {

    public Egg[] store() {
        Egg[] food = bounty.toArray(new Egg[0]);
        return food;
    }
}
