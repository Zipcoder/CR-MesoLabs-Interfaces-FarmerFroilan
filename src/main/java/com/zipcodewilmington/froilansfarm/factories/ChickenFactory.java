package com.zipcodewilmington.froilansfarm.factories;

import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Chicken;
import com.zipcodewilmington.froilansfarm.storage.ChickenCoops;

import java.util.ArrayList;
import java.util.List;


public class ChickenFactory {


    public Chicken createChicken() {
        Chicken chicken = new Chicken();
        return chicken;
    }


    public List<Chicken> createChickenList(Integer numberOFChickens){
        Chicken chicken = createChicken();
        List<Chicken> chickenList = new ArrayList<Chicken>();

        for (int i = 0; i < numberOFChickens; i++){
            chickenList.add(i, chicken);
        }
        return chickenList;
    }

}
