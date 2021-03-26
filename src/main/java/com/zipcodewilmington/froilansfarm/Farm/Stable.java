package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.LivingThing;

import java.util.ArrayList;

public class Stable extends Housing<Horse>{
    ArrayList<Horse> stable = new ArrayList<Horse>();

    public Stable() {}

    public Stable(int numOfHorses, Horse horse) {
        for (int i = 0; i < numOfHorses; i++) {
            store(horse);
        }
    }

    public void brokenLeg (Horse horse) {
        stable.remove(horse);
    }

    @Override
    public int size() {
        return stable.size();
    }

    @Override
    public void store(Horse horse) {
        stable.add(horse);
    }
}
