package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal implements Produce {


    public void yield() {

    }
    @Override
    public String makeNoise() {
        return "Bawk";
    }

}
