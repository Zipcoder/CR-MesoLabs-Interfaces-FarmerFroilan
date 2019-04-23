package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Pilot extends Person implements Rider {

    @Override
    public void mount(Rideable object) {
        if(!object.getMountedStatus()) {
            object.mount();
        }
    }

    @Override
    public void dismount(Rideable object) {
        if(object.getMountedStatus()) {
            object.dismount();
        }
    }
}
