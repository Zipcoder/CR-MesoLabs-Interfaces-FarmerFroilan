package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/1/18
 */
public class ChickenCoop extends Enclosure<Chicken> {
    private static final int fDEFAULT_NUMBER_OF_CHICKENS = 3;

    public ChickenCoop() {
        this(fDEFAULT_NUMBER_OF_CHICKENS);
    }

    public ChickenCoop(int numberOfHorses) {
        super(numberOfHorses);
    }
}
