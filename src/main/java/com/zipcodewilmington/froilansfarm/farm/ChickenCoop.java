package com.zipcodewilmington.froilansfarm.farm;
import com.zipcodewilmington.froilansfarm.animal.Chicken;
import java.util.ArrayList;

public class ChickenCoop {

    ArrayList<Chicken> chickens = new ArrayList<Chicken>();


    public void addChickens(Chicken chickToadd){
        this.chickens.add(chickToadd);
    }

    public void removeChicken(Chicken chickenToRemove){
        this.chickens.remove(chickenToRemove);
    }

    public ArrayList<Chicken> getChickens(){
        return this.chickens;
    }

    public Integer getNumOfChickens(){
        return this.chickens.size();
    }
}
