package com.zipcodewilmington.froilansfarm;

public class AnimalFactory {
    public static Chicken createChicken() {
        return new Chicken();
    }

    public static Horse createHorse() {
        return new Horse();
    }
}
