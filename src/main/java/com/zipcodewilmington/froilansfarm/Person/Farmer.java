package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Field.Crop;
import com.zipcodewilmington.froilansfarm.Field.CropRow;
import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public class Farmer extends Person implements Botanist {

    public String makeNoise() {
        return "Being an old farm boy myself, chickens coming home\n to roost never" +
                " did make me sad; they've always made me glad.";
    }
    public void eat() {

    }

    public void mount(Rideable rideable) {

    }

    public void dismount(Rideable rideable) {

    }

    public void plant(Crop crop, CropRow cropRow) {

    }
}
