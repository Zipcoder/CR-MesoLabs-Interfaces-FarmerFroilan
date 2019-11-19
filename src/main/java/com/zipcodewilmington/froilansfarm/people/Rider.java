package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.interfaces.Rideable;

public class Rider extends Farmer{

    private String name;
    Rideable rideable;


    Rider(String name) {
        super(name);
    }

    public void mount(Rideable rideable)    {
        this.rideable = rideable;
        rideable.mounted();
    }


    public void disMount(Rideable rideable) {
        this.rideable = rideable;
        rideable.dismounted();
    }
}
