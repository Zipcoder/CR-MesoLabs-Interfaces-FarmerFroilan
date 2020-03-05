package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.farmland.CropRow;
import com.zipcodewilmington.froilansfarm.farmland.Field;
import com.zipcodewilmington.froilansfarm.storage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.storage.Stable;

public class Farm {
    public Field field;
    public ChickenCoop coop1;
    public ChickenCoop coop2;
    public ChickenCoop coop3;
    public ChickenCoop coop4;
    public Stable stable1;
    public Stable stable2;
    public Stable stable3;

    public Farm() {
        this.field = new Field();
        for (int i = 0; i < 5; i++) {
            field.addCropRowsToCropField(new CropRow());
            coop1.add(new Chicken());
            coop2.add(new Chicken());
            coop3.add(new Chicken());
        }
        for (int i = 0; i < 3; i++) {
            stable1.add(new Horse());
        }

    }

    public Field getField() {
        return field;
    }
}