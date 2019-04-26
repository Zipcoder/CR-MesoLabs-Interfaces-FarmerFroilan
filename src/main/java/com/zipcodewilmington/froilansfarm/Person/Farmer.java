package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Field.Crop;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Interfaces.*;

public class Farmer extends Person implements Botanist, Rider {

    public void plant(CropRow cropRow, Crop crop) {

        cropRow.getCropRow().add(crop);
    }

    public void eat(Edible edible) {
        this.getPersonsBelly().add(edible);
    }

    public void mount(Rideable rideable) {
        rideable.riding();
    }

    public void dismount(Rideable rideable) {
        rideable.endRiding();
    }

    public String makeNoise() {

        return "This farm won't run itself... Good thing I'm a Farmer!";
    }
}
