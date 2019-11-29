package com.zipcodewilmington.froilansfarm.farm;

public class FroilanFarmFactory {

    public static Farm makeFarm() {

        Farm froilanFarm = new Farm();
        addChickens(froilanFarm);
        addHorses(froilanFarm);

        return froilanFarm;
    }


    private static void addChickens(Farm farm) {

        //add chickens to farm

    }

    private static void addHorses(Farm farm) {

        //add horses to farm

    }

}
