package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animal.Chicken;

import java.util.ArrayList;

public class ChickenCoop {
    private final ArrayList<Chicken> chickensInCoop = new ArrayList<Chicken>();

    public ArrayList<Chicken> getChickensInCoop() {
        return chickensInCoop;
    }

    public void startOfDayReset(){
        for (Chicken chicken: chickensInCoop) {
            chicken.startOfDayReset();
        }
    }
}
