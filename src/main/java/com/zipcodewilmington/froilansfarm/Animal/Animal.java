package com.zipcodewilmington.froilansfarm.Animal;

import java.util.List;

public interface Animal extends NoiseMaker, Eater {

    public boolean isHungry();
    public List reproduce(Integer increaseBy);
}
