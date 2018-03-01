package com.zipcodewilmington.froilansfarm;

public class Person implements NoiseMaker, Eater, Rider{

    public void eat(Edible food) {

    }

    public String makeNoise() {
        return "Hey";
    }

    public void mount(Rideable thingToMount) {

    }

    public void dismount(Rideable thingToMount) {

    }

    // Can be abstract? Only two people, Farmer and Pilot

}
