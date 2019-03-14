package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Stable {


    ArrayList<Horse> horsesInStable;

    public Stable(int numberOfHorses){
        horsesInStable = new ArrayList<Horse>();
        setNumberOfHorses(numberOfHorses);
    }


    public void setNumberOfHorses(int numberOfHorses){

        horsesInStable.clear();

        for(int i = 0; i < numberOfHorses; i++){
            horsesInStable.add(new Horse());
        }
    }
}
