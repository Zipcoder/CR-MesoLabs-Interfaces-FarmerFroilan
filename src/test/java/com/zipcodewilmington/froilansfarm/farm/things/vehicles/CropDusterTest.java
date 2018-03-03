package com.zipcodewilmington.froilansfarm.farm.things.vehicles;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.field.CropRow;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people.Pilot;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.CornStalk;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CropDusterTest {

    CropDuster badLarry;
    Pilot froilanda;

    @Before
    public void setUp(){
        badLarry = new CropDuster("Bad Larry");
        froilanda = new Pilot("Froilanda");
    }


    @Test
    public void flyTest(){
        //Given

        //When
        froilanda.mount(badLarry);
        badLarry.fly();

        //Then
        Assert.assertTrue(badLarry.isFlying());
    }

    @Test
    public void flyFailTest(){
        //Given

        //When
        badLarry.fly();

        //Then
        Assert.assertFalse(badLarry.isFlying());
    }

    @Test
    public void landTest(){
        //Given

        //When
        froilanda.mount(badLarry);
        badLarry.fly();
        badLarry.land();

        //Then
        Assert.assertFalse(badLarry.isFlying());
    }

    @Test
    public void operateTest(){
        //Given
        Farm froilandia = new Farm();

        //When
        badLarry.operate(froilandia);

        //Then
        Assert.assertTrue(froilandia.getVehicles().contains(badLarry));
    }

    @Test
    public void shutDownTest(){
        //Given
        Farm froilandia = new Farm();
        badLarry.operate(froilandia);

        //When
        badLarry.shutDown(froilandia);

        //Then
        Assert.assertFalse(froilandia.getVehicles().contains(badLarry));
    }

    @Test
    public void makeNoiseTest(){
        //Given

        //When
        String expected = "mmmmmmmrrrrRRRRRROOOOOOOWWWWWWwwwwwww!!!";
        String actual = badLarry.makeNoise();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void fertilzeTest(){
        //Given
        CropRow row = new CropRow(new CornStalk(), new CornStalk(), new CornStalk());

        //When
        badLarry.fertilize(row);

        //Then
        Assert.assertTrue(row.getCrop(0).isFertilized());
        Assert.assertTrue(row.getCrop(1).isFertilized());
        Assert.assertTrue(row.getCrop(2).isFertilized());
    }


}
