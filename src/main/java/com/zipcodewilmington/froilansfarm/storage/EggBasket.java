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

    public Boolean isEmpty(EggBasket eggBaskets) {
        return this.eggBaskets.isEmpty();
    }

    public void add(Egg edibleEgg) {this.eggBaskets.add(edibleEgg); }

    public void removeEgg(Egg edibleEgg){this.eggBaskets.remove(edibleEgg);}

    public Integer getNumberOfEggs(){return eggBaskets.size();}

    public void addEdibleEggsFromCoop(List<Chicken> fertilizedChickens){
        eggBaskets.addAll(ChickenCoops.collectEdibleEggs(fertilizedChickens));
    }

    public void removeAllEggs(){ this.eggBaskets.clear();}
}
