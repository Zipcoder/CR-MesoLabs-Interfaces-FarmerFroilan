package com.zipcodewilmington.froilansfarm.people;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.food.Egg;

import java.util.ArrayList;

public class Farmer extends Person implements Rider, Botanist
{
    Farm farmOwned;
    Boolean harvestEgg;
    Boolean mount;
    Boolean dismount;
    Boolean plant;

    public Boolean harvestEgg(ArrayList<Egg> eggsHarvested)
    {
        return harvestEgg;
    }

    public Boolean mount()
    {

        return mount;
    }

    public Boolean dismount()
    {
        return dismount;
    }

    public Boolean plant() {
        return plant;
    }
}
