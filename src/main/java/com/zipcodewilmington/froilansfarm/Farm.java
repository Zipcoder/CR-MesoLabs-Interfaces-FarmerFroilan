package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.farmland.Field;

public class Farm {
    public Field field;

    public Farm() {
        this.field = new Field();
    }

    public Field getField() {
        return field;
    }
}
