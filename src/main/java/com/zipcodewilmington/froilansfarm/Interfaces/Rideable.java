package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Rideable {

    // can be mounted by anything implementing rider
    boolean isMounted = false;

    public boolean mounted();
    public boolean dismounted();

}
