package com.zipcodewilmington.froilansfarm.crop;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class Potato implements Edible {

    private boolean isEdible = true;

    public boolean getIsEdible() {
        return this.isEdible;
    }
}
