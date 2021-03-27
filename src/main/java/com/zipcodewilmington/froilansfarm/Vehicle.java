package com.zipcodewilmington.froilansfarm;

public abstract class Vehicle implements NoiseMaker, Rideable {

    String type;

    public abstract void enter();

    public abstract void exit();

}
