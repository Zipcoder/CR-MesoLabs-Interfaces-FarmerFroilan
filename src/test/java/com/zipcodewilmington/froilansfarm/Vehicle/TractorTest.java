package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Crop.Crop;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Crop.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Exceptions.NoDriverException;
import com.zipcodewilmington.froilansfarm.Farm.Farm;
import com.zipcodewilmington.froilansfarm.Farm.FoodStore;
import com.zipcodewilmington.froilansfarm.Food.StaminaValue;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * filename:
 * project: froilans-farm
 * author: https://github.com/vvmk
 * date: 3/3/18
 */
public class TractorTest {
    Farmer rider;
    Tractor tractor;
    FoodStore store;
    Farm farm;

    @Before
    public void setup() {
        rider = new Farmer("rin", 10);
        farm = new Farm();
        store = new FoodStore();
        tractor = new Tractor(store);
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
        rider.mount(tractor);
        List<CropRow> rows = farm.getField().getCropRows();

        int expectedStamina = 0;
        for (CropRow row : rows) {
            for (int i = 0; i < 3; i++) {
                rider.plant(new TomatoPlant(), row);
                expectedStamina += StaminaValue.TOMATO.asInteger();
            }
        }

        int totalStaminaBefore = store.getTotalStamina();

        Assert.assertNotEquals(expectedStamina, totalStaminaBefore);

        try {
            tractor.operate(farm);
        } catch (NoDriverException e) {
            Assert.fail();
        }

        int actual = store.getTotalStamina();

        Assert.assertEquals(expectedStamina, actual);
    }
}