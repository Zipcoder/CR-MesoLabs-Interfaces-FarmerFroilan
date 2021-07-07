package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Animal.Farmer;

import java.util.ArrayList;
import java.util.List;

public class FarmHouse implements Shelter {
    List<Farmer> farmHouse = new ArrayList<>();

    public FarmHouse() {
    }

    public Boolean isEmpty() {
        return farmHouse.isEmpty();
    }

    public void add(Farmer farmer) {
        farmHouse.add(farmer);
    }

    public void remove(Farmer farmer) {
        farmHouse.remove(farmer);
    }

    public Integer itemCount() {

        return farmHouse.size();
    }

    @Override
    public void add() {

    }

    @Override
    public void remove() {

    }
}
