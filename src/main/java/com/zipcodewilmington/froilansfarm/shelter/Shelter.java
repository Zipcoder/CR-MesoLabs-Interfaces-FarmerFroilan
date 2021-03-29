package com.zipcodewilmington.froilansfarm.shelter;

import java.util.ArrayList;
import java.util.List;

public abstract class Shelter<T> {
    private List<T> inShelter = new ArrayList<T>();

    public Shelter(List<T> inShelter){
        this.inShelter = inShelter;
    }

    public Shelter(){

    }

    public void add(T element){
        inShelter.add(element);
    }

    public Boolean remove(T element){
        return (inShelter.remove(element));
    }

    public T get(int index){
        return inShelter.get(index);
    }

    public int size(){
        return inShelter.size();
    }

}
