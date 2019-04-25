package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Food.FoodReplicator;
import com.zipcodewilmington.froilansfarm.Food.StaminaValue;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/4/18
 */
public class FoodStore {
    private Map<String, Integer> foodstore;

    public FoodStore(Edible... seedData) { //lol
        foodstore = new HashMap<>();
        seed(seedData);
    }

    public List<Edible> getFood(String foodName, int requestedAmount) {
        foodName = foodName.toUpperCase();
        int actualTaken = getAvailable(foodName, requestedAmount);
        return replicateFood(foodName, actualTaken);
    }

    protected List<Edible> replicateFood(String foodName, int howMany) {
        List<Edible> order = new ArrayList<>();

        for (int i = 0; i < howMany; i++)
            order.add(FoodReplicator.replicate(foodName));

        return order;
    }

    public void storeFood(Edible food) {
        String key = getKey(food);
        Integer stock = foodstore.get(key);
        if (stock != null) {
            foodstore.put(key, ++stock);
        } else
            foodstore.put(key, 1);
    }

    public String getKey(Edible food) {
        return food.getClass().getSimpleName().toUpperCase();
    }

    protected int getAvailable(String requestedFood, int requestedAmount) {
        Integer stock = foodstore.get(requestedFood);
        int actualAmount = 0;
        if (stock != null) {
            actualAmount = (requestedAmount > stock) ? stock : requestedAmount;
            removeStock(requestedFood, actualAmount);
        }
        return actualAmount;
    }

    protected void removeStock(String food, int requestedAmount) {
        int stock = foodstore.get(food);
        int newStock = stock - requestedAmount;
        foodstore.put(food, newStock);
    }

    protected void seed(Edible[] data) {
        for (Edible d : data)
            storeFood(d);
    }

    public int getTotalStamina() {
        int sum = 0;
        for (Map.Entry<String, Integer> e : foodstore.entrySet()) {
            sum += (StaminaValue.getStamina(e.getKey()) * e.getValue());
        }
        return sum;
    }
}
