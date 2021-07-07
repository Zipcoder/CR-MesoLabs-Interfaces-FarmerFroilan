package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Edibles.Edible;

public interface Produce<T extends Edible>{
     T yield();

}
