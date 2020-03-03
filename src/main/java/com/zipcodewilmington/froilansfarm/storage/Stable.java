package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animals.Horse;

import java.util.ArrayList;
import java.util.List;

public class Stable implements Storage<Horse>{

    List<Horse> stable = new ArrayList<Horse>();

    public Boolean add(Horse horseToAdd) {
        if(!stable.contains(horseToAdd)){
            stable.add(horseToAdd);
            return true;
        }else
            return false;
    }

    public Boolean remove(Horse horseToRemove) {
        if(stable.contains(horseToRemove)){
            stable.remove(horseToRemove);
            return true;
        }else
            return false;
    }

    public Integer size() {
        return stable.size();
    }
}
