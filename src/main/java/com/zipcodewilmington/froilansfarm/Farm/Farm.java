package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

import java.util.ArrayList;
import java.util.List;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/1/18
 */
public class Farm {
    //TODO: Tasks charge a stamina cost, and a time cost. May need Task interface.

    private static final int fDEFAULT_NUMBER_OF_COOPS = 4;
    private static final int fDEFAULT_NUMBER_OF_STABLES = 3;
    private final List<Stable> stables;
    private final List<ChickenCoop> chickenCoops;
    private FarmHouse farmHouse;
    private Field field;

    public Farm() {
        farmHouse = new FarmHouse();
        stables = new ArrayList<>(fDEFAULT_NUMBER_OF_STABLES);
        chickenCoops = new ArrayList<>(fDEFAULT_NUMBER_OF_COOPS);

        field = new Field();
    }

    public void buildStables() {
        for (int i = 0; i < fDEFAULT_NUMBER_OF_STABLES; i++)
            stables.add(new Stable());
    }

    public void buildCoops() {
        for (int i = 0; i < fDEFAULT_NUMBER_OF_COOPS; i++)
            chickenCoops.add(new ChickenCoop());
    }

    public Field getField() {
        return field;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public void feedHorses(Farmer farmer, List<Edible> bag) {
        int inventory = bag.size();
        for (Stable stable : stables) {
            for (Horse horse : stable.getAll()) {
                if (inventory > 0) {
                    farmer.feed(horse, bag.remove(bag.size() - 1));
                    inventory--;
                } else
                    break;
            }
        }
    }

    public int getNumberOfHorses() {
        int sum = 0;
        for (Stable stable : stables)
            sum += stable.getAll().size();
        return sum;
    }

    public void feedChickens(Farmer farmer, EarCorn chickenFeed) {
        for (ChickenCoop coop : chickenCoops) {
            for (Chicken chicken : coop.getAll()) {
                farmer.feed(chicken, chickenFeed);
            }
        }
    }

    public void rideHorses(Farmer farmer) {
        for (Stable stable : stables) {
            for (Horse horse : stable.getAll()) {
                farmer.mount(horse);
                farmer.dismount(horse);
            }
        }
    }
}
