package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.animal.Egg;
import com.zipcodewilmington.froilansfarm.crop.EarCorn;
import com.zipcodewilmington.froilansfarm.crop.Potato;
import com.zipcodewilmington.froilansfarm.crop.Tomato;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

import java.util.ArrayList;

public class Silo {

    private final ArrayList<EarCorn> earCornStorage = new ArrayList<EarCorn>();
    private final ArrayList<Tomato> tomatoStorage = new ArrayList<Tomato>();
    private final ArrayList<Potato> potatoStorage = new ArrayList<Potato>();
    private final ArrayList<Egg> eggStorage = new ArrayList<Egg>();

    public void storeFood(ArrayList<Edible> incomingFood){
        for (Edible edible: incomingFood) {
            if (edible instanceof EarCorn){
                earCornStorage.add((EarCorn) edible);
            } else if (edible instanceof Tomato){
                tomatoStorage.add((Tomato) edible);
            } else if (edible instanceof Potato){
                potatoStorage.add((Potato) edible);
            } else if (edible instanceof Egg){
                eggStorage.add((Egg) edible);
            }
        }
    }

    public ArrayList<Egg> getEggStorage() {
        return eggStorage;
    }

    public ArrayList<Potato> getPotatoStorage() {
        return potatoStorage;
    }

    public ArrayList<Tomato> getTomatoStorage() {
        return tomatoStorage;
    }

    public ArrayList<EarCorn> getEarCornStorage() {
        return earCornStorage;
    }

    public Egg removeAnEgg(){
        Egg egg = eggStorage.get(0);
        eggStorage.remove(0);
        return egg;
    }

    public Tomato removeATomato(){
        Tomato tomato = tomatoStorage.get(0);
        tomatoStorage.remove(0);
        return tomato;
    }

    public Potato removeAPotato(){
        Potato potato = potatoStorage.get(0);
        potatoStorage.remove(0);
        return potato;
    }

    public EarCorn removeAnEarCorn(){
        EarCorn earCorn = earCornStorage.get(0);
        earCornStorage.remove(0);
        return earCorn;
    }
}
