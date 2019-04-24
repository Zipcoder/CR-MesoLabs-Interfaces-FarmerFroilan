package com.zipcodewilmington.froilansfarm.FarmBuildings;

import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.EdibleEgg;
import com.zipcodewilmington.froilansfarm.Edibles.Tomato;
import com.zipcodewilmington.froilansfarm.Edibles.Watermelon;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.util.ArrayList;

public class Refrigerator {

    public ArrayList<EarCorn> harvestedEarCorns = new ArrayList<>();
    public ArrayList<EdibleEgg> harvestedEdibleEggs = new ArrayList<>();
    public ArrayList<Tomato> harvestedTomatoes = new ArrayList<>();
    public ArrayList<Watermelon> harvestedWatermelon = new ArrayList<>();

    public ArrayList<EarCorn> getHarvestedEarCorns() {
        return harvestedEarCorns;
    }

    public ArrayList<EdibleEgg> getHarvestedEdibleEggs() {
        return harvestedEdibleEggs;
    }

    public ArrayList<Tomato> getHarvestedTomatoes() {
        return harvestedTomatoes;
    }

    public ArrayList<Watermelon> getHarvestedWatermelon() {
        return harvestedWatermelon;
    }


    public void freezeFood(ArrayList<Edible> harvestedFoods){
        for (Edible edible : harvestedFoods){
            if (edible instanceof EarCorn){
                harvestedEarCorns.add((EarCorn) edible);
            }
            else if (edible instanceof EdibleEgg){
                harvestedEdibleEggs.add((EdibleEgg) edible);
            }
            else if (edible instanceof Tomato){
                harvestedTomatoes.add((Tomato) edible);
            }
            else if (edible instanceof Watermelon){
                harvestedWatermelon.add((Watermelon) edible);
            }
        }
    }

    public EarCorn takeEarCorn(){
        EarCorn earCorn = harvestedEarCorns.get(0);
        harvestedEarCorns.remove(0);
        return earCorn;
    }
    public EdibleEgg takeEdibleEgg(){
        EdibleEgg edibleEgg = harvestedEdibleEggs.get(0);
        harvestedEdibleEggs.remove(0);
        return edibleEgg;
    }
    public Tomato takeTomato(){
        Tomato tomato = harvestedTomatoes.get(0);
        harvestedTomatoes.remove(0);
        return tomato;
    }
    public Watermelon takeWatermelon(){
        Watermelon watermelon = harvestedWatermelon.get(0);
        harvestedWatermelon.remove(0);
        return watermelon;
    }

}
