package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;

import java.util.ArrayList;
import java.util.List;

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

    public ChickenCoop(int numberOfChickens) {
        super(populate(numberOfChickens));
    }

    protected static List<Chicken> populate(int numberOfChickens) {
        List<Chicken> ret = new ArrayList<>(numberOfChickens);
        for (int i=0;i<numberOfChickens;i++)
            ret.add(new Chicken());
        return ret;
    }
}
