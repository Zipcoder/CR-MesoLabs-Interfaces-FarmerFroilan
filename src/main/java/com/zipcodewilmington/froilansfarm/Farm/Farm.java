package com.zipcodewilmington.froilansfarm.Farm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;

import java.util.ArrayList;

public class Farm {
    Chicken chicken = new Chicken();
    Horse horse = new Horse();
    ChickenCoop coopOne = new ChickenCoop(4, chicken);
    ChickenCoop coopTwo = new ChickenCoop(4, chicken);
    ChickenCoop coopThree = new ChickenCoop(3, chicken);
    ChickenCoop coopFour = new ChickenCoop(4, chicken);

    Stable stableOne = new Stable(4, horse);
    Stable stableTwo = new Stable(3, horse);
    Stable stableThree = new Stable(3, horse);
}
