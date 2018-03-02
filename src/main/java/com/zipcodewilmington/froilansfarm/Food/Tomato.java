package com.zipcodewilmington.froilansfarm.Food;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/1/18
 */
public class Tomato extends Food {
    public Tomato() {
        this(StaminaValue.TOMATO);
    }

    private Tomato(StaminaValue staminaValue) {
        super(staminaValue);
    }
}
