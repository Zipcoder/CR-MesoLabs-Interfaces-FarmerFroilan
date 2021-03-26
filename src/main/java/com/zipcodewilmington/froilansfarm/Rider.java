package com.zipcodewilmington.froilansfarm;

public interface Rider<typeOfRideable extends Rideable> {

    //should these be void??
    public void mount(typeOfRideable rideable);
    public void dismount(typeOfRideable rideable);

}
