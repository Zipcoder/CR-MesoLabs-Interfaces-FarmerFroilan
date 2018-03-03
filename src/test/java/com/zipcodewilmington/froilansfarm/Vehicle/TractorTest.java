package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/3/18
 */
public class TractorTest {
    Rider rider;
    Tractor tractor;
    @Before
    public void setup() {
        rider = new Farmer("rin", 10);
        tractor = new Tractor();
    }

    @Test
    public void harvestCrop() {
        Crop<TomatoPlant> plant = new TomatoPlant();
        Edible expected = new Tomato();

        rider.mount(tractor);

        Edible actual = tractor.harvest(plant);

        Assert.assertEquals(expected.getClass(), actual.getClass());
    }

    @Test
    public void testOperate() {
        Assert.fail();
    }
}