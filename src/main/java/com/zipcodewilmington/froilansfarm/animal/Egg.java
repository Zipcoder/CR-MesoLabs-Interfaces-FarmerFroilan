package com.zipcodewilmington.froilansfarm.animal;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class Egg implements Edible{
    private boolean isEdible = true;

    public boolean getIsEdible() {
        return this.isEdible;
    }
}
