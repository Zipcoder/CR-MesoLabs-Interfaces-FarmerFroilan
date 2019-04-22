package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people;

import com.zipcodewilmington.froilansfarm.farm.buildings.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.buildings.Stable;
import com.zipcodewilmington.froilansfarm.farm.buildings.WareHouse;
import com.zipcodewilmington.froilansfarm.farm.things.Rideable;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals.Chicken;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals.Horse;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Edible;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.EdibleType;
import com.zipcodewilmington.froilansfarm.farm.things.vehicles.Aircraft;

public class Pilot extends Person implements Rider,AnimalFeeder {

    public Pilot(String name) {
        super(name);
    }

    public void flyAircraft(Aircraft plane){
        plane.fly();

    }

    public void landAircraft(Aircraft plane){
        plane.land();

    }

    public String makeNoise() {
        return "Talk to me Goose";
    }

    public void mount(Rideable ride) {
        ride.getOn();

    }

    public void dismount(Rideable ride) {
        ride.getOff();

    }

    public void exerciseHorses(Stable stableToExercise) {
        for(Horse h : stableToExercise.getAllHorses()){
            this.mount(h);
            h.goForRide();
            this.dismount(h);
        }
    }

    public void feedChickens (ChickenCoop targetCoop, WareHouse wareHouseToFeedFrom){
        for(Chicken c : targetCoop.getAllChickens()){
            c.eat(EdibleType.CHICKENFEED, wareHouseToFeedFrom);
        }
    }

    public void feedHorses (Stable targetStable, WareHouse wareHouseToFeedFrom){
        for(Horse h : targetStable.getAllHorses()){
            h.eat(EdibleType.HAY, wareHouseToFeedFrom);
        }

    }

}
