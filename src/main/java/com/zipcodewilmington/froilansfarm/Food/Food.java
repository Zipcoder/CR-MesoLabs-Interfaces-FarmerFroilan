package com.zipcodewilmington.froilansfarm.Food;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/2/18
 */
public abstract class Food implements Edible {
    private boolean consumed;
    private int staminaValue;

    protected Food(StaminaValue staminaValue) {
        consumed = false;
        this.staminaValue = staminaValue.asInteger();
    }

    public void consume() {
        consumed = true;
    }

    public int getStaminaValue() {
        return staminaValue;
    }

    public boolean isConsumed() {
        return consumed;
    }
}
