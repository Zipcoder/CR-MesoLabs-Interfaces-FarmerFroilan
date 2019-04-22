package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people;

import com.zipcodewilmington.froilansfarm.farm.buildings.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.buildings.Stable;
import com.zipcodewilmington.froilansfarm.farm.buildings.WareHouse;

public interface AnimalFeeder {
    void feedChickens (ChickenCoop targetCoop, WareHouse wareHouseToFeedFrom);
    void feedHorses (Stable targetStable, WareHouse wareHouseToFeedFrom);
}
