package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/1/18
 */
public abstract class Person implements NoiseMaker, Eater {
    private static final int fDEFAULT_STARTING_STAMINA = 10;
    private boolean hungry;
    private int stamina; //TODO: eat(edible) adds edible.staminaVal to stamina, tasks remove task.staminaReq. (i.e. hungry <= 10 slows actions, 0 == starving prevents actions.

    public Person() {
        hungry = true;
        stamina = fDEFAULT_STARTING_STAMINA;
    }

    public void makeNoise() {

    }

    public void eat(Edible food) {
        hungry = false;
        food.consume();
    }

    public boolean isHungry() {
        return hungry;
    }
}
