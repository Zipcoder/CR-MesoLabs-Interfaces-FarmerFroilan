package com.zipcodewilmington.froilansfarm.factories;

import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Horse;
import com.zipcodewilmington.froilansfarm.animals.people.Farmer;
import com.zipcodewilmington.froilansfarm.animals.people.Pilot;

import java.util.ArrayList;

public class AnimalFactory  {

    public static ArrayList<Horse> createHorses(Integer amount) {
        ArrayList<Horse> horses = new ArrayList<Horse>();

        for(int i = 0; i<amount; i++){
            horses.add(new Horse());
        }

        return horses;
    }

    public static Horse createHorse() {
        Horse horse = createHorses(1).get(0);

        return horse;
    }

    public static ArrayList<Pilot> createPilots(Integer amount) {
        ArrayList<Pilot> pilots = new ArrayList<Pilot>();

        for(int i = 0; i<amount; i++){
            pilots.add(new Pilot());
        }

        return pilots;
    }

    public static Pilot createPilot() {
        Pilot pilot = createPilots(1).get(0);

        return pilot;
    }

    public static ArrayList<Farmer> createFarmers(Integer amount) {
        ArrayList<Farmer> farmers = new ArrayList<Farmer>();

        for(int i = 0; i<amount; i++){
            farmers.add(new Farmer());
        }

        return farmers;
    }

    public static Farmer createFarmer() {
        Farmer farmer = createFarmers(1).get(0);

        return farmer;
    }

}
