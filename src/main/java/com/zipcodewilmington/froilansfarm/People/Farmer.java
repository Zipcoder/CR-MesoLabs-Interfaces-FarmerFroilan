package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.Production.Crop;
import com.zipcodewilmington.froilansfarm.Production.CropRow;

public class Farmer extends Person implements Rider, Botanist {


    public Farmer() {

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

    public void plant(Crop someCrop, CropRow someCropRow) {
        someCropRow.addCrop(someCrop);

    }

    public void makeNoise() {
        System.out.println("Hello");
    }

    public void eat(Edible object) {
        System.out.println("yum");
    }

}
