package com.zipcodewilmington.froilansfarm;


import com.zipcodewilmington.froilansfarm.Animal.Farmer;
import com.zipcodewilmington.froilansfarm.Shelter.Shelter;

import java.util.List;

public class FoodStorage<T> implements Shelter {


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

    public Boolean isEmpty() {
        return foodStorage.isEmpty();
    }

    public Boolean atCapacity() {
        //TODO needs a proper return
        return null;
    }

    public Boolean add() { return null; }
    public Boolean remove() { return null; }
    public Integer itemCount() { return null; }
}

//    public void setTomatoStorage(){
//        Tomatoes tomatoes=new Tomatoes();
//        FoodStorage<Tomato> tomatoStorage= new FoodStorage<Tomato>();
//                tomatoStorage.add(tomatoes.getTomatoes());
//       // farmer.harvest()
//    }


//FoodStorage<tomato> tomnotostorage;
//tomnotostorage.add(tomato)