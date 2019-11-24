package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.edibles.Edibles;
import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Froilanda extends Pilot implements Eater, Rider {
    public Froilanda(String name) {
        super(name);
    }

    public void Eat(Edibles edible) {

    }

    public void mount(Rideable rideable) {
        rideable.mounted();
    }

    public void dismount(Rideable rideable) {
        rideable.dismounted();
    }
}
