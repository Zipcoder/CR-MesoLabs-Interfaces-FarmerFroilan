package com.zipcodewilmington.froilansfarm.animals.people;

import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Rideable;
import com.zipcodewilmington.froilansfarm.interfaceBehaviors.Rider;

public class Farmer extends Person implements Botanist, Rider {


    public void plant() {

    }

    public void mount(Rideable item ) {
        item.ride();
    }

}
