package com.zipcodewilmington.froilansfarm.storage;

import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Chicken;
import com.zipcodewilmington.froilansfarm.animals.people.Farmer;
import com.zipcodewilmington.froilansfarm.animals.people.Person;
import com.zipcodewilmington.froilansfarm.factories.AnimalFactory;
import com.zipcodewilmington.froilansfarm.producers.produce.Egg;

import java.util.ArrayList;
import java.util.List;

public class EggBasket implements Storage<Egg> {
    private List<Egg> eggBaskets;

    public EggBasket(){
        this.eggBaskets = null;
    }

    public void add(Egg edibleEgg) {this.eggBaskets.add(edibleEgg); }

    public Integer getNumberOfEggs(){return eggBaskets.size();}

    public List<Egg> takeEggsFromBasket(EggBasket eggBasket, Integer numberOfEggsToCollect){
        List<Egg> groceryList =new ArrayList<>();
        for (int i = 0; i < numberOfEggsToCollect; i++) {
            groceryList.add(eggBaskets.remove(getNumberOfEggs() - 1));
        }
        return groceryList;
    }

    public void removeAllEggs(EggBasket eggBasket){ this.eggBaskets.clear();}

}
