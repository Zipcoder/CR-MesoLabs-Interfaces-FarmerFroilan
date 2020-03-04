package com.zipcodewilmington.froilansfarm.Production;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.util.ArrayList;

public class EdibleStorage {

    private ArrayList<Edible> edibleStorage;

    public EdibleStorage() {
        edibleStorage = new ArrayList<Edible>();
    }

    public ArrayList<Edible> getEdibleStorage() {
        return this.edibleStorage;
    }

    public int getSize() {
        return getEdibleStorage().size();
    }

    public void removeFromEdibleStorage(Edible object) {
        edibleStorage.remove(object);
    }

    public void addToEdibleStorage(Edible object) {
        if (object != null)
        getEdibleStorage().add(object);
    }


}
