package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.EdiblePackage.Edible;
import com.zipcodewilmington.froilansfarm.Persons.Rider;
import com.zipcodewilmington.froilansfarm.Rideable;

public class Horse extends Animal implements Rideable {

    public String eat(Edible obj) {
        System.out.println("munch munch munch");
        return "munch munch munch";
    }

    public String makeNoise() {
        System.out.println("Neeeighhh!");
        return "Neeeighhh!";
    }

    public boolean isMounted(Rider riderObj) {
        String mounted = riderObj.mount(this);
        if (mounted.equals(riderObj + " gets on the " + this + ".")) return true;
        return false;
    }
}
