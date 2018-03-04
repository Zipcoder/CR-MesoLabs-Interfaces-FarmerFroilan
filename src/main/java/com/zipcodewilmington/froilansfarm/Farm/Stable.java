package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animal.Horse;

import java.util.ArrayList;
import java.util.List;

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
        super(populate(numberOfHorses));
    }

    protected static List<Horse> populate(int numberOfHorses) {
        List<Horse> ret = new ArrayList<>(numberOfHorses);
        for (int i = 0; i < numberOfHorses; i++)
            ret.add(new Horse());
        return ret;
    }
}
