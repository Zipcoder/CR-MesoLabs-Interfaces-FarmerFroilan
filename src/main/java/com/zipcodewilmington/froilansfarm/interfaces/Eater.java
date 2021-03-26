package com.zipcodewilmington.froilansfarm.interfaces;

public interface Eater<T extends Edible> {

    public void eat(T food);
}
