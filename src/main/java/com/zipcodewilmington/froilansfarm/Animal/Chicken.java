package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/1/18
 */
public class Chicken extends Animal implements Produce {
    private static final String fDEFAULT_NAME = "Lady Kluk";
    public Chicken() {
        this(fDEFAULT_NAME);
    }

    public Chicken(String name) {
        super(name);
    }

    public Edible yield() {
        return new Egg();
    }

    public void speak() {
        // cluck cluck, mothafucka
    }
}
