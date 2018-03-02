package com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.Produce;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Tomato;

public class TomatoPlant extends Crop  {

    public Tomato yield() {
        if(this.isFertilized() && this.isHarvested()){
            return new Tomato();
        }

        return null;
    }
}
