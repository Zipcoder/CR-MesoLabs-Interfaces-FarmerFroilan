package com.zipcodewilmington.froilansfarm.FieldRelated;

import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Produce;

public class CornStalk extends Crop implements Produce<EarCorn> {
    public String getType() {
        return this.type;
    }

    private String type = "CornStalks";
    public EarCorn yield() {

        return new EarCorn();
    }
}
