package com.zipcodewilmington.froilansfarm.Food;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/1/18
 */
public class Egg extends Food {
    public Egg() {
        this(StaminaValue.EGG);
    }

    private Egg(StaminaValue staminaValue) {
        super(staminaValue);
    }
}
