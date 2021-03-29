package com.zipcodewilmington.froilansfarm.shelter;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

import java.util.List;

public class FoodInventory extends Shelter<Edible> {

    public FoodInventory(List<Edible> edibleList){
        super(edibleList);
    }

    public FoodInventory(){

    }



}
