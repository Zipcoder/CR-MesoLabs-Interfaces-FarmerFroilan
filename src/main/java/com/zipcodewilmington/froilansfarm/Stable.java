package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.Horse;

import java.util.ArrayList;
import java.util.List;

public class Stable {

    List<Horse> horses = new ArrayList<Horse>();

    public Stable(Horse ...horses) {
        for (Horse horse : horses) {
            this.horses.add(horse);
        }
    }

    public Integer getHorses() {
        return horses.size();
    }

    public void addHorse(Horse horse) {
        this.horses.add(horse);
    }
}
