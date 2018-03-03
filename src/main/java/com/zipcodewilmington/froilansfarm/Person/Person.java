package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;

import java.util.ArrayList;

public class Person implements NoiseMaker, Eater{

    ArrayList<Edible> humanStomach = new ArrayList<>();

    @Override
    public void eat(Edible food) {
        humanStomach.add(food);
    }

    @Override
    public String makeNoise() {
        return "People sounds";
    }

    public ArrayList<Edible> lookInStomach() {
        return this.humanStomach;
    }

}
