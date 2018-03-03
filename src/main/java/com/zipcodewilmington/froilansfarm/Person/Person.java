package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Exceptions.StaminaTooLowException;
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
    private int stamina;
    private String name;

    public Person() {
        this("anonymous");
    }

    public Person(String name) {
        this(name, fDEFAULT_STARTING_STAMINA);
    }

    public Person(String name, int startingStamina) {
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
        // "my name is getName()"
    }

    protected void updateHungry() {
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
}
