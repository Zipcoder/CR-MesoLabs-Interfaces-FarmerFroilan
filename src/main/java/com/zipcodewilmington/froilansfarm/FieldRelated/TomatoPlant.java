package com.zipcodewilmington.froilansfarm.FieldRelated;

import com.zipcodewilmington.froilansfarm.Produce;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;

public class TomatoPlant extends Crop implements Produce<Tomato> {

    @Override
    public String getType() {
        return this.type;
    }

    private String type = "Tomato Plants";
    public Tomato yield() {
        return new Tomato();
    }
}
