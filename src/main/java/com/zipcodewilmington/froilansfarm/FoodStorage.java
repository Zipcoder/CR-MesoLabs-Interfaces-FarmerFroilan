package com.zipcodewilmington.froilansfarm;



import com.zipcodewilmington.froilansfarm.Produce.Edible;


import java.util.List;


public class FoodStorage<T extends Edible>  {
    private List<T> foodStorage;

    public FoodStorage(List<T> foodStorage) {
        this.foodStorage = foodStorage;
    }

    public FoodStorage() {

    }


    public void add(T edible) {
        foodStorage.add(edible);

    }

    public T retrieve(T edible) {

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

    public Boolean atCapacity() {
        //TODO needs a proper return
        return null;
    }



    public Integer itemCount() { return foodStorage.size(); }
}




