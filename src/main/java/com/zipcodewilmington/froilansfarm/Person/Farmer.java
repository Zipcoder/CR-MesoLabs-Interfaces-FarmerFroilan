package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;

public class Farmer extends Person implements Botanist {

    public String makeNoise() {
        return "Being an old farm boy myself, chickens coming home to roost never" +
                " did make me sad; they've always made me glad.";
    }
    public boolean eat() {
        return true;
    }

    public void mount() {

    }

    public void dismount() {

    }
}
