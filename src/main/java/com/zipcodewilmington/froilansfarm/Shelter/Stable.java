package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Animal.Animal;
import com.zipcodewilmington.froilansfarm.Animal.Horse;

import java.util.ArrayList;
import java.util.List;

public class  Stable implements Shelter {
    List<Horse> stable = new ArrayList<>();

    public Stable() {
    }

    public Boolean isEmpty() {
        return stable.isEmpty();
    }

    public void add(Horse horse) {
        stable.add(horse);
    }

    public void remove(Horse horse) {
        stable.remove(horse);
    }

    public Integer itemCount() {

        return stable.size();
    }

    @Override
    public void add() {

    }

    @Override
    public void remove() {

    }
}