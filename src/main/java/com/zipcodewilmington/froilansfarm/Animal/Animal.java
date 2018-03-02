package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.StaminaTooLowException;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/1/18
 */
public abstract class Animal implements NoiseMaker, Eater {
    private static final int fDEFAULT_STAMINA = 10;
    private int stamina;
    private boolean hungry;
    private String name;

    public Animal(String name) {
        this(name, fDEFAULT_STAMINA);
    }

    protected Animal(String name, int startingStamina) {
        this.name = name;
        this.stamina = startingStamina;
        updateHungry();
    }

    public void eat(Edible food) {
        food.consume();
        addStamina(food.getStaminaValue());
    }

    protected void addStamina(int nutrition) {
        stamina += nutrition;
        updateHungry();
    }

    protected int getStamina() {
        return stamina;
    }

    public void makeNoise() {
        speak();
    }

    private void updateHungry() {
        hungry = (stamina < 10);
    }

    public boolean isHungry() {
        return hungry;
    }

    public String getName() {
        return this.name;
    }

    public void exert(int staminaToConsume) throws StaminaTooLowException {
        if (canExertStamina(staminaToConsume))
            stamina -= staminaToConsume;
        else
            throw new StaminaTooLowException();
    }

    protected boolean canExertStamina(int staminaToConsume) {
        return (staminaToConsume <= getStamina());
    }

    abstract void speak();
}
