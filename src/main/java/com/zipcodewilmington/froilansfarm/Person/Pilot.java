package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Pilot extends Person implements Rider {

    public String makeNoise() {
        return "Danger Zone";
    }

    public void eat() {

    }

    @Override
    public void mount(Rideable copDuster) {

    }

    @Override
    public void dismount(Rideable cropDuster) {

    }
}
