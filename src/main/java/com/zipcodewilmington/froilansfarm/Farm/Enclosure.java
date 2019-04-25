package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animal.Animal;

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

    public List<E> getAll() {
        return animals;
    }
}
