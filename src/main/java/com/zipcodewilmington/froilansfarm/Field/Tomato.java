package com.zipcodewilmington.froilansfarm.Field;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

public class Tomato implements Edible{

    private Tomato tomato;

    public Tomato(int id){
        this.tomato = new Tomato(id);
    }

    public boolean isEdible() {
        return false;
    }

}
