package com.zipcodewilmington.froilansfarm.storage;


import com.zipcodewilmington.froilansfarm.food.Edible;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Silo implements Storage<Edible>{

    private List<Edible> siloEgg;

    public Silo(){
        siloEgg = new ArrayList<Edible>();
    }

    public Silo(Edible... edibles){
        this();
        Collections.addAll(siloEgg, edibles);
    }

    public Boolean add(Edible edibleToAdd) {
        if(!siloEgg.contains(edibleToAdd)){
            siloEgg.add(edibleToAdd);
            return true;
        }else
            return false;
    }

    public Boolean remove(Edible edibleToRemove) {
        if(siloEgg.contains(edibleToRemove)){
            siloEgg.remove(edibleToRemove);
            return true;
        }else
            return false;
    }

    public Integer size() {
        return siloEgg.size();
    }
}
