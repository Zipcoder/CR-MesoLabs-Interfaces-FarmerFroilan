package com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.Produce;

public class CornStalk extends Crop  {

    public EarCorn yield() {

        if(this.isFertilized() && this.isHarvested()){
            return new EarCorn();
        }

        return null;
    }
}
