package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animal.Horse;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/1/18
 */
public class Stable extends Enclosure<Horse> {
    //TODO: feedHorses(Edible... ) -> horses.each( horse.consume(food.totalStaminaValue / numberOfHorses));

    private static final int fDEFAULT_NUMBER_OF_HORSES = 3;


    public Stable() {
        this(fDEFAULT_NUMBER_OF_HORSES);
    }

    public Stable(int numberOfHorses) {
        super(numberOfHorses);
    }
}
