package com.zipcodewilmington.froilansfarm;

public interface Rider <T extends Ridable>{
    public void mount(T mountable);
    public void dismount(T mountable);
}
