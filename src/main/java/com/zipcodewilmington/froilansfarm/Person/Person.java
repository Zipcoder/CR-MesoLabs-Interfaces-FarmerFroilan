package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Buildings.Stable;
import com.zipcodewilmington.froilansfarm.FarmAnimal.Horse;
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

    public void rideHorse(Horse object) {
        object.setHasBeenRidden();
    }

    public void rideAllHorses(Stable stable) {
        for(int i = 0; i < stable.getHorses().size(); i++) {
            rideHorse(stable.getHorses().get(i));
        }
    }

}
