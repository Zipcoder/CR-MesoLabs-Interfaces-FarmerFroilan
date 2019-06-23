package com.zipcodewilmington.froilansfarm;


import com.zipcodewilmington.froilansfarm.Animal.Farmer;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Shelter.Shelter;

import java.util.List;

public class FoodStorage<T>  {

   // Farmer farmer = new Farmer();
    TomatoPlant tp=new TomatoPlant();

    private List<T> foodStorage;


    public void add(T production) {
        foodStorage.add(production);

    }

    public T retrieve(T consumption) {

        foodStorage.remove(consumption);
        return consumption;
    }

    public List<T> getT() {
        return foodStorage;
    }

    public void setT(List<T> t) {
        this.foodStorage = foodStorage;
    }


}

//    public void setTomatoStorage(){
//        Tomatoes tomatoes=new Tomatoes();
//        FoodStorage<Tomato> tomatoStorage= new FoodStorage<Tomato>();
//                tomatoStorage.add(tomatoes.getTomatoes());
//       // farmer.harvest()
//    }


//FoodStorage<tomato> tomnotostorage;
//tomnotostorage.add(tomato)