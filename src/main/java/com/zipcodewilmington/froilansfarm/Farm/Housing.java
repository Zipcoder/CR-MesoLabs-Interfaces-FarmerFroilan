package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.LivingThing;

import java.util.ArrayList;

public abstract class Housing<E extends LivingThing> {
    ArrayList<E> livingStorage = new ArrayList<E>();

    public void store(E creature) {
        livingStorage.add(creature);
    }

    public int size() {
        return livingStorage.size();
    }
}
