package com.zipcodewilmington.froilansfarm.farm.buildings;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Edible;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.EdibleType;

import java.util.ArrayList;

public class WareHouse <E extends Edible> {

    private ArrayList<E> foodStorage;

    public WareHouse(E ... foodToAdd){
        this.foodStorage = new ArrayList<>(0);
        for(E e : foodToAdd){
            this.foodStorage.add(e);
        }
    }

    public E getEdible(int edibleIndex){
        return this.foodStorage.get(edibleIndex);
    }

    public E getEdibleByType(EdibleType typeToGet){
        for(E e : foodStorage){
            if(isTypeOfEdible(typeToGet,e)){
                return e;
            }
        }
        return null;
    }


    public Edible[] getFoodStorageArray(){
        return this.foodStorage.toArray(new Edible[0]);
    }

    public void addEdible(E edibleToAdd){
        this.foodStorage.add(edibleToAdd);
    }

    public int getStorageSize(){
        return this.foodStorage.size();
    }

    public void removeEdible(E edilbeToRemove){
        this.foodStorage.remove(edilbeToRemove);
    }

    public void removeEdibleByType(EdibleType typeToRemove){
        for (E e : foodStorage){
            if(isTypeOfEdible(typeToRemove, e)){
                this.removeEdible(e);
                break;
            }
        }
    }

    public void removeMultipleEdibles(EdibleType typeToRemove, int numberToRemove){
        for(int i = 0; i<numberToRemove; i++){
            removeEdibleByType(typeToRemove);
        }

    }

    public static boolean isTypeOfEdible(EdibleType typeToCheck, Edible edibleToCheck){
        return typeToCheck.toString().equalsIgnoreCase(edibleToCheck.getClass().getSimpleName());
    }

    public void removeNulls(){
        ArrayList<E> newStorage = new ArrayList<E>(0);
        for(int i = 0; i<this.getStorageSize(); i++){
            if(this.foodStorage.get(i) != null){
                newStorage.add(this.foodStorage.get(i));
            }
        }
        this.foodStorage = newStorage;
    }


}
