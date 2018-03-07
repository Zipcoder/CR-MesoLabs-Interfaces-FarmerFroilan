package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Pilot extends Person {


    public Pilot() {

    }

    public void mount(Rideable object) {

        if (object.getIsMounted()) {
            System.out.println("Cannot mount. Seat taken.");
        } else {
            object.toggleIsMounted();
            System.out.println("Yeehaw");
        }
    }

    public void dismount(Rideable object) {

        if (!object.getIsMounted()) {
            System.out.println("That is not mounted!");
        } else {
            object.toggleIsMounted();
            System.out.println("Back on my feet!");
        }
    }

    public void makeNoise() {
        System.out.println("Hello");
    }

    public void eat(Edible object) {
        System.out.println("yum");
    }



}
