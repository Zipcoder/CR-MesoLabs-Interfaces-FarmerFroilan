package com.zipcodewilmington.froilansfarm.Persons;

import com.zipcodewilmington.froilansfarm.Rideable;

public interface Rider extends Person {
    String mount(Rideable obj);
    String dismount(Rideable obj);

}
