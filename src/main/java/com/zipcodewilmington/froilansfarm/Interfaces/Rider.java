package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Rider <T extends Rideable>{
    void mount(T rideable);
    void dismount();
}