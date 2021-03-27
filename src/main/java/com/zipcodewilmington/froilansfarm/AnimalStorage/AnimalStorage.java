package com.zipcodewilmington.froilansfarm.AnimalStorage;

import com.zipcodewilmington.froilansfarm.Animal;

import java.util.ArrayList;

public class AnimalStorage <T extends Animal> {

    ArrayList<T>barn = new ArrayList<T>();

    public void add(T animal){

        barn.add(animal);
    }

    public T get(int index){

        return barn.get(index);
    }

    public void remove() {

        barn.remove(0);

    }

   public int animalCount() {

        return barn.size();
    }

}
