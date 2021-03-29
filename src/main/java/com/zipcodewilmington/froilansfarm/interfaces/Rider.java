package com.zipcodewilmington.froilansfarm.interfaces;

public interface Rider <T extends Ridable>{

    //Either more string fluff, or boolean checks to ensure
    // vehicles can only operate if they're being ridden.
    //In either case, get name of ridable to use in the string.
    public void mount(T mountable);
    public void dismount(T mountable);
}
