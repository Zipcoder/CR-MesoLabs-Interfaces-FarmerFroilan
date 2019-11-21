package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.people.Rider;

public interface Rideable {
    Boolean riderRiding(Rider rider); //if rider rides something, should return true
    void dismount();
}
