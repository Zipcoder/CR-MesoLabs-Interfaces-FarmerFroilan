package com.zipcodewilmington.froilansfarm.shelter;

import java.util.ArrayList;
import java.util.List;

public abstract class Shelter<T> {
    private List<T> inShelter = new ArrayList<T>();

    public Shelter(){

    }

    public void add(T element){
        inShelter.add(element);
    }

    public void remove(T element){
        inShelter.remove(element);
    }

    public T get(int index){
        return inShelter.get(index);
    }

    public int size(){
        return inShelter.size();
    }

}
