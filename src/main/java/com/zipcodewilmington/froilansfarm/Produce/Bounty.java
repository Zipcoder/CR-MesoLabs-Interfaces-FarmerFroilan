package com.zipcodewilmington.froilansfarm.Produce;

import java.util.LinkedList;
import java.util.List;

public class Bounty<T extends Edible> {

    private List<T> bounty;

    public Bounty() {
        bounty = new LinkedList<T>();
    }
    
}
