package com.zipcodewilmington.froilansfarm.FieldRelated;

import com.zipcodewilmington.froilansfarm.Edibles.Potato;
import com.zipcodewilmington.froilansfarm.Produce;

public class PotatoPlant extends Crop implements Produce<Potato> {
    public Potato yield() {
        return new Potato();
    }
    private String type = "Potato Plants";
    public String getType() {
       return this.type;
    }
}
