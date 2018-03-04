package com.zipcodewilmington.froilansfarm.Food;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/2/18
 */
public enum StaminaValue {
    EARCORN(2), TOMATO(2), EGG(3), PEPPER(1), ONE(1);

    private int staminaValue;

    StaminaValue(int staminaValue) {
        this.staminaValue = staminaValue;
    }

    public static int getStamina(String name) {
        for (StaminaValue sv : StaminaValue.values()) {
            if (sv.toString().equalsIgnoreCase(name))
                return sv.asInteger();
        }
        return 0;
    }

    public int asInteger() {
        return this.staminaValue;
    }
}
