package com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people;

import com.zipcodewilmington.froilansfarm.farm.field.CropRow;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals.Horse;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.Crop;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Egg;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.Hay;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FarmerTest {

    Farmer froilan;
    CornStalk stalky;
    CornStalk stalker;
    Horse shadowfax;
    CropRow row1;

    @Before
    public void setup(){
        froilan = new Farmer("Froiland");
        stalky = new CornStalk();
        stalker = new CornStalk();
        shadowfax = new Horse("Shadowfax");
        row1 = new CropRow();

    }

    @Test
    public void makeNoiseTest(){
        //Given
        //Farmer froilan

        //When
        String expected = "E I E I O";
        String actual = froilan.makeNoise();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void plantTest(){
        //Given
        //Farmer froilan

        //When
        froilan.plant(stalky, row1);
        Crop expected = stalky;
        Crop actual = row1.getCrop(0);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void plantMultipleTest(){
        //Given
        //Farmer froilan

        //When
        froilan.plant(stalky, row1);
        froilan.plant(stalker, row1);

        Crop[] expected = {stalky,stalker};
        Crop[] actual = row1.getAllCrops().toArray(new Crop[0]);

        //Then
        Assert.assertArrayEquals(expected,actual);

    }

    @Test
    public void mountTest(){
        //Given
        //Farmer froilan

        //When
        froilan.mount(shadowfax);

        //Then
        Assert.assertTrue(shadowfax.isBeingRidden());
    }

    @Test
    public void dismountTest(){
        //Given
        //Farmer froilan

        //When
        froilan.mount(shadowfax);
        froilan.dismount(shadowfax);

        //Then
        Assert.assertFalse(shadowfax.isBeingRidden());
    }


}
