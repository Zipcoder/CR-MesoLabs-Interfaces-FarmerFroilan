package com.zipcodewilmington.froilansfarm.Produce;

import java.util.LinkedList;
import java.util.List;

abstract class Bounty<T extends Edible> {

    private List<T> bounty;

    public Bounty() {
        bounty = new LinkedList<T>();
    }

    public void add(T edible) {
        bounty.add(edible);
    }

    abstract T[] store();
    
}
