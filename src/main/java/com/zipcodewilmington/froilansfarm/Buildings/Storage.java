package com.zipcodewilmington.froilansfarm.Buildings;

import com.sun.xml.internal.xsom.impl.scd.Iterators;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.util.ArrayList;
import java.util.List;

public class Storage {
    List<Edible> tomatoCache = new ArrayList<>();
    List<Edible> bananaCache = new ArrayList<>();
    List<Edible> cornCache = new ArrayList<>();

    public List<Edible> getTomatoCache() {
        return tomatoCache;
    }

    public List<Edible> getBananaCache() {
        return bananaCache;
    }

    public List<Edible> getCornCache() {
        return cornCache;
    }

    public void addToTomatoCache(Edible food) {
        tomatoCache.add(food);
    }

    public void addToBananaCache(Edible food) {
        bananaCache.add(food);
    }

    public void addToCornCache(Edible food) {
        cornCache.add(food);

    }

    public List<Edible> takeTomatosFromCache(Integer number) {
        List<Edible> foods = new ArrayList<>();

        if(tomatoCache.size() >= number) {
            for(int i = 0; i < number; i++) {
                foods.add(tomatoCache.get(0));
                tomatoCache.remove(0);
            }
        }
        return foods;
    }
    public List<Edible> takeBananasFromCache(Integer number) {
        List<Edible> foods = new ArrayList<>();

        if(bananaCache.size() >= number) {
            for(int i = 0; i < number; i++) {
                foods.add(bananaCache.get(0));
                bananaCache.remove(0);
            }
        }
        return foods;
    }

    public List<Edible> takeCornFromCache(Integer number) {
        List<Edible> foods = new ArrayList<>();

        if(cornCache.size() >= number) {
            for(int i = 0; i < number; i++) {
                foods.add(cornCache.get(0));
                cornCache.remove(0);
            }
        }
        return foods;
    }
}
