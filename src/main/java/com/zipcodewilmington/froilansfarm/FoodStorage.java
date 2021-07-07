package com.zipcodewilmington.froilansfarm;



import com.zipcodewilmington.froilansfarm.Produce.Edible;


import java.util.ArrayList;
import java.util.List;


public class FoodStorage<T extends Edible>  {
    private List<T> foodStorage;

    public FoodStorage(List<T> foodStorage) {
        this.foodStorage = foodStorage;
    }

    public FoodStorage() {
    this.foodStorage=new ArrayList<>();
    }
//    public FoodStorage() {
//        this.foodStorage=new T[100];
//    }

    public void add(T edible) {
        foodStorage.add(edible);

    }

    public T retrieve(T edible) {
            if(foodStorage.contains(edible))
        foodStorage.remove(edible);
        return edible;
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


    public Integer itemCount() { return foodStorage.size(); }
}




