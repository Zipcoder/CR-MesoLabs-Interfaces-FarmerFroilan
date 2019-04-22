package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.field.CropRow;

public interface Botanist {
    void plant (Crop cropToPlant, CropRow plantingLocation);
}
