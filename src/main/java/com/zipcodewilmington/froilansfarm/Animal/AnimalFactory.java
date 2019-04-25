package com.zipcodewilmington.froilansfarm.Animal;

import java.util.function.Supplier;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/3/18
 */
public enum AnimalFactory {
    CHICKEN(Chicken::new),
    HORSE(Horse::new);

    Supplier<Animal> supplier;

    AnimalFactory(Supplier<Animal> supplier) {
        this.supplier = supplier;
    }

    public static Animal make(Class<?> clazz) {
        for (AnimalFactory a : AnimalFactory.values()) {
            if (a.toString().equalsIgnoreCase(clazz.getSimpleName()))
                return a.supplier.get();
        }
        return null;
    }
}
