package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.edible.Edible;

public interface Eater<typeOfFood extends Edible> {

    public void eat(typeOfFood food);

}
