package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Animal.Cow;

import java.util.ArrayList;
import java.util.List;

public class Barn implements Shelter {
    List<Cow> barn = new ArrayList<>();

    public Barn() {
    }

    public Boolean isEmpty() {
        return barn.isEmpty();
    }

    public void add(Cow cow) {
        barn.add(cow);
    }

    public void remove(Cow cow) {
        barn.remove(cow);
    }

    public Integer itemCount() {

        return barn.size();
    }

    @Override
    public void add() {

    }

    @Override
    public void remove() {

    }
}

