package com.zipcodewilmington.froilansfarm.farm;

public final class FroilanFarmSingleton {

    private static Farm froilanFarm;

    private FroilanFarmSingleton() {}

    public static Farm getInstance() {
        if (froilanFarm == null) {
            froilanFarm = FroilanFarmFactory.makeFarm();
        }
        return froilanFarm;
    }
}
