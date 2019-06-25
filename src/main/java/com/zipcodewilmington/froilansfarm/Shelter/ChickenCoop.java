package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop implements Shelter {
    List<Chicken> chickenCoop = new ArrayList<>();

    public ChickenCoop() {
    }

    public Boolean isEmpty() {
        return chickenCoop.isEmpty();
    }

    public void add(Chicken chicken) {
        chickenCoop.add(chicken);
    }

    public void remove(Chicken chicken) {
        chickenCoop.remove(chicken);
    }

    public Integer itemCount() {

        return chickenCoop.size();
    }



    @Override
    public void add() {

    }

    @Override
    public void remove() {


    }
}
