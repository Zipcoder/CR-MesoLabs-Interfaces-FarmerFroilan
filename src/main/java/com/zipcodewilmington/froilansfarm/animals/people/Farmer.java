package com.zipcodewilmington.froilansfarm.animals.people;

import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Rideable;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Rider;
import com.zipcodewilmington.froilansfarm.producers.produce.Crop;

public class Farmer extends Person implements Botanist, Rider {


    public void plant(Crop crop) {
        crop.yield();
    }

    public void harvest(Crop crop) {
        crop.yield();
    }

    public void mount(Rideable rideable ) {
        rideable.ride();
    }

}
