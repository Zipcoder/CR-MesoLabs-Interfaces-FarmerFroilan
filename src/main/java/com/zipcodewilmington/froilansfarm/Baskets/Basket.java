package com.zipcodewilmington.froilansfarm.Baskets;

import com.zipcodewilmington.froilansfarm.Edibles.Edible;

import java.util.ArrayList;

public class Basket <T extends Edible> extends Edible {

    ArrayList<T> list = new ArrayList<T>();

    public Basket(final ArrayList<T> list) {
        this.list = list;
    }

    public Basket() {

    }

    public void add(T edible){
        list.add(edible);
    }
    public int size(){
        return list.size();

    }
    public void remove(Integer numToRemove){
        for (int i = 0; i < numToRemove; i++) {
            list.remove(0);
        }
    }

}
