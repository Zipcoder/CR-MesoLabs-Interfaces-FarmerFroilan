package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Crops.BananaTree;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.FarmAnimal.Horse;
import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FarmerTest {

    Farmer joe;
    Crop crop;
    Crop crop2;
    CropRow cropRow;
    Horse horse;

    @Before
    public void setup() {
        joe = new Farmer();
        crop = new TomatoPlant();
        crop2 = new BananaTree();
        cropRow = new CropRow();
        horse = new Horse();
    }

    @Test
    public void inheritanceTest() {
        Assert.assertTrue(joe instanceof Person);
    }

    @Test
    public void implementationTest() {
        Assert.assertTrue(joe instanceof Eater);
        Assert.assertTrue(joe instanceof Rider);
        Assert.assertTrue(joe instanceof Botanist);
    }

    @Test
    public void plantTest() {
        joe.plant(crop, cropRow);
        joe.plant(crop2, cropRow);

        List<Crop> expected = Arrays.asList(crop, crop2);
        List<Crop> actual = cropRow.getCropRow();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void mountTest() {
        joe.mount(horse);

        boolean expected = true;
        boolean actual = horse.getMountedStatus();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dismountTest() {
        joe.mount(horse);
        joe.dismount(horse);

        boolean expected = false;
        boolean actual = horse.getMountedStatus();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makeNoiseTest() {
        String expected = "I'm a farmer...";
        String actual = joe.makeNoise();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fillCropRow() {
        joe.fillCropRow(cropRow, crop2);

        int expected = 30;
        int actual = cropRow.getCropRow().size();

        Assert.assertEquals(expected, actual);

    }

}