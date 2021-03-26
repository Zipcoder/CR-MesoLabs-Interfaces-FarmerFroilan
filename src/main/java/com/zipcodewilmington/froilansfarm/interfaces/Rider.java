package com.zipcodewilmington.froilansfarm.interfaces;

public interface Rider <T extends Ridable>{
    public void mount(T mountable);
    public void dismount(T mountable);
}
