package com.zipcodewilmington.froilansfarm.peopletest;

import com.zipcodewilmington.froilansfarm.food.Egg;
import com.zipcodewilmington.froilansfarm.people.Farmer;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FarmerTest
{
    Farmer test = new Farmer();
    Egg harvestedEgg = new Egg();

    @Test
    public void TestEggHarvest()
    {
        //Given
        ArrayList<Egg> eggNum = new ArrayList<Egg>();
        test.harvestEgg(eggNum);

        //When
        Boolean expected = eggNum.size() != 0;
        //Then

        Assert.assertTrue(expected);

    }

    @Test
    public void TestMount()
    {
        Farmer riding = new Farmer();
        Assert.assertTrue(riding.mount());

    }

    @Test
    public void TestDismount()
    {
        Farmer riding = new Farmer();
        riding.mount();
        Assert.assertTrue(riding.dismount());

    }

    @Test
    public void TestPlant()
    {
        Farmer planting = new Farmer();
        Assert.assertTrue(planting.plant());
    }
}
