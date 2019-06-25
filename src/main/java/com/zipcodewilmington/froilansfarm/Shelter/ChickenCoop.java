package com.zipcodewilmington.froilansfarm.Shelter;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;

import java.util.ArrayList;
import java.util.List;

public class ChickenCoop<Chicken> implements Shelter {
   ChickenCoop chickenCoop1 = new ChickenCoop();
    ChickenCoop chickenCoop2 = new ChickenCoop();
    ChickenCoop chickenCoop3 = new ChickenCoop();
    ChickenCoop chickenCoop4 = new ChickenCoop();
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
    public Integer itemCount() {
        return null;
    }

    public Integer itemCount(List<Chicken> chickenCoop) {
        return chickenCoop.size();
    }
//    public Integer totalAllCoops(){
//        Integer total = chickenCoop1.size() + chickenCoop2.size() + chickenCoop3.size() + chickenCoop4.size();
//        return total;
//    }
}
