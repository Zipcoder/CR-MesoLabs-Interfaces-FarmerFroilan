package com.zipcodewilmington.froilansfarm.Produce;

import java.util.LinkedList;
import java.util.List;

public abstract class Bounty<T extends Edible> {

    List<T> bounty;

    public Bounty() {
        bounty = new LinkedList<T>();
    }

    public void add(T edible) {
        bounty.add(edible);
    }

    abstract Edible[] store();

    protected Boolean isEmpty() {
        return bounty.isEmpty();
    }
    
}
