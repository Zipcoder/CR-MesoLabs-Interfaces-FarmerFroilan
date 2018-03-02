package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.StaminaTooLowException;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/1/18
 */
public interface Eater {
    void eat(Edible food);
    boolean isHungry();
    void exert(int stamina) throws StaminaTooLowException;
}
