package com.zipcodewilmington.froilansfarm.Food;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

import java.util.function.Supplier;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/4/18
 */
public enum FoodReplicator {
    EGG(Egg::new),
    PEPPER(Pepper::new),
    TOMATO(Tomato::new),
    EARCORN(EarCorn::new);

    Supplier<Edible> supplier;

    FoodReplicator(Supplier<Edible> supplier) {
        this.supplier = supplier;
    }

    public static Edible replicate(String foodName) {
        for (FoodReplicator fr : FoodReplicator.values()) {
            if (fr.toString().equalsIgnoreCase(foodName))
                return fr.supplier.get();
        }
        return null;
    }
}
