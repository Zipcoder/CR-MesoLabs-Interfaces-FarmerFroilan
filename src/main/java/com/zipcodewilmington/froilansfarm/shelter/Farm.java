package com.zipcodewilmington.froilansfarm.shelter;

import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.person.Person;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    List<ChickenCoop> chickenCoops = new ArrayList<ChickenCoop>();
    List<Stables> stables = new ArrayList<Stables>();
    FarmHouse farmHouse = new FarmHouse();

    //Possibly instantiate vehicles/people/animals here? -> LEAVING THIS UP TO YOU ABE lol
    //Yeah, that's fair. I'm the one using em anyhow, lol. --Abe

    public Farm(){
    }

    public List<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }
    public List<Stables> getStables(){return stables;}

    public void addStable(Stables s){
        stables.add(s);
    }
    public void addCoop(ChickenCoop c){
        chickenCoops.add(c);
    }
    public FarmHouse getHouse(){
        return farmHouse;
    }
    public void moveIn(Farmer wack){
        farmHouse.add(wack);
    }
}
