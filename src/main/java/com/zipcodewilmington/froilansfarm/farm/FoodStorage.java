package com.zipcodewilmington.froilansfarm.farm;

import com.zipcodewilmington.froilansfarm.food.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FoodStorage {

    protected Map<String, ArrayList<Edible>> store;

    public FoodStorage(){
        store = new HashMap<>();
        store.put("Carrots", new ArrayList<>());
        store.put("Onions", new ArrayList<>());
        store.put("Eggs", new ArrayList<>());
        store.put("Potatoes", new ArrayList<>());
        store.put("Tomatoes", new ArrayList<>());
        store.put("Corn", new ArrayList<>());
    }

    public void storeCarrot(Carrot carrot){
        store.get("Carrots").add(carrot);
    }
    public void storeOnion(Onion onion){
        store.get("Onions").add(onion);
    }
    public void storeEgg(Egg egg){
        store.get("Eggs").add(egg);
    }
    public void storePotato(Potato potato){
        store.get("Potatoes").add(potato);
    }
    public void storeTomato(Tomato tomato){
        store.get("Tomatoes").add(tomato);
    }
    public void storeEarCorn(EarCorn earCorn){
        store.get("Corn").add(earCorn);
    }
    public int carrotAmount(){
        return store.get("Carrots").size();
    }
    public int onionAmount(){
        return store.get("Onions").size();
    }
    public int eggAmount(){
        return store.get("Eggs").size();
    }
    public int potatoAmount(){
        return store.get("Potatoes").size();
    }
    public int tomatoAmount(){
        return store.get("Tomatoes").size();
    }
    public int earCornAmount(){
        return store.get("Corn").size();
    }
    public Carrot removeCarrot(){
        return (Carrot) store.get("Carrots").remove(0);
    }
    public Onion removeOnion(){
        return (Onion) store.get("Onions").remove(0);
    }
    public Egg removeEgg(){
        return (Egg) store.get("Eggs").remove(0);
    }
    public Potato removePotato(){
        return (Potato) store.get("Potatoes").remove(0);
    }
    public Tomato removeTomato(){
        return (Tomato) store.get("Tomatoes").remove(0);
    }
    public EarCorn removeEarCorn(){
        return (EarCorn) store.get("Corn").remove(0);
    }
}
