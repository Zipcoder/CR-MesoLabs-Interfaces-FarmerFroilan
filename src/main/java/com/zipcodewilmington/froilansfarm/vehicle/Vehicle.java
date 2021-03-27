package com.zipcodewilmington.froilansfarm.vehicle;

import com.zipcodewilmington.froilansfarm.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Rideable;

public abstract class Vehicle implements NoiseMaker, Rideable {
    String name;
    String color;
    Integer speed = 0;
    String noise;
    Boolean isBeingUsed = false;
}
