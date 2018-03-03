package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animal.Animal;
import com.zipcodewilmington.froilansfarm.Animal.AnimalFactory;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/1/18
 */
public abstract class Enclosure<E extends Animal> {
    private List<E> animals;

    public Enclosure(List<E> animals) {
        this.animals = animals;
    }

    public void add(E e) {
        animals.add(e);
    }

    public void remove(E e) {
        animals.remove(e);
    }

    public E getAnimalByName(String name) {
        for (E e : animals) {
            if (e.getName().equals(name))
                return e;
        }
        return null;
    }

    protected List<E> populate(int numberOfAnimals) {
        List<? super E> ret = new ArrayList<>();
        String typeString = "";

        for (int i=0;i<numberOfAnimals;i++) {
            Class<E> clazz = new Class<E>();
        }
        return null;
    }
}
