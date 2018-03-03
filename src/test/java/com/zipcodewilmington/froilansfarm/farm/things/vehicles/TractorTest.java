package com.zipcodewilmington.froilansfarm.farm.things.vehicles;

import com.zipcodewilmington.froilansfarm.farm.field.CropRow;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.TomatoPlant;
import org.junit.Assert;
import org.junit.Test;

public class TractorTest {

    @Test
    public void makeNoiseTest(){
        //Given
        Tractor badLenny = new Tractor("Bad Lenny");

        //When
        String expected = "baRUMPBUMPbumpbumpBUMPBUMP!!!";
        String actual = badLenny.makeNoise();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void harvestCropTest(){
        //Given
        Tractor badLenny = new Tractor("Bad Lenny");
        CropRow row = new CropRow(new TomatoPlant(), new TomatoPlant(), new TomatoPlant());

        //When

    }

}
