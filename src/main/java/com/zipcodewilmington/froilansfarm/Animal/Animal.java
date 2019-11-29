package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.miscinterfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.food.Eater;

public abstract class Animal implements Eater, NoiseMaker {

    public Integer amountOfFoodEaten(){
        return null;
    }


}
