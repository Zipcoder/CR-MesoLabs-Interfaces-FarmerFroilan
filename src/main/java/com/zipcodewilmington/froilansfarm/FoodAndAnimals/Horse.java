package com.zipcodewilmington.froilansfarm.FoodAndAnimals;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Horse extends Animal implements Rideable{

    int idNumber;

    public Horse(){
        this.idNumber = 0000;
    }
    public Horse(int idNumber){
        this.idNumber = idNumber;
    }

    public String makeNoise() {
        return "NEEEEEEYYYYY!";
    }

    public boolean mounted() {
        return false;
    }

    public boolean dismounted() {
        return false;
    }
}
