package com.zipcodewilmington.froilansfarm.Farm;

import java.util.ArrayList;
import java.util.List;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/1/18
 */
public class Farm {
    private static final int fDEFAULT_NUMBER_OF_COOPS = 4;
    private static final int fDEFAULT_NUMBER_OF_STABLES = 3;

    private FarmHouse farmHouse;
    private List<Stable> stables;
    private List<ChickenCoop> chickenCoops;

    public Farm() {
        farmHouse = new FarmHouse();
        stables = new ArrayList<>(fDEFAULT_NUMBER_OF_STABLES);
        chickenCoops = new ArrayList<>(fDEFAULT_NUMBER_OF_COOPS);
    }
}
