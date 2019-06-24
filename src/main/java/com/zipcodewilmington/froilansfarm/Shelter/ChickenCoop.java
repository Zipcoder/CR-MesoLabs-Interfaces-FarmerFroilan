package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop<Chicken> implements Shelter {
    List<Chicken> chickenCoop1 = new ArrayList<>();
    List<Chicken> chickenCoop2 = new ArrayList<>();
    List<Chicken> chickenCoop3 = new ArrayList<>();
    List<Chicken> chickenCoop4 = new ArrayList<>();

    public Boolean isEmpty() {
        return null;
    }

    public Boolean atCapacity() {
        return true;
    }

    public Boolean add() {
        return true;
    }

    public Boolean remove() {
        return true;
    }
    @Override
    public Integer itemCount(List<Chicken> chickenCoop) {
        return chickenCoop.size();
    }
    public Integer totalAllCoops(){
        Integer total = chickenCoop1.size() + chickenCoop2.size() + chickenCoop3.size() + chickenCoop4.size();
        return total;
    }
}
