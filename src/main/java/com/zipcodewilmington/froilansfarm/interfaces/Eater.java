package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.shelter.FoodInventory;

public interface Eater<T extends Edible> {

    public void eat(T food, FoodInventory whatever);
}
