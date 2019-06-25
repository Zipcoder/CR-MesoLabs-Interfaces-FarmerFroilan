package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Animal.*;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CropDusterTest {

    @Test
    public void instanceOf(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof FarmVehicle);
    }
    @Test
    public void instanceOf1(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof Flyable);
    }
    @Test
    public void instanceOf2(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof NoiseMaker);
    }

    @Test
    public void makesNoise() {
        CropDuster cropDuster = new CropDuster();
        String actual = "vrooom";
        Assert.assertEquals(actual, cropDuster.makeNoise());
    }


    @Test
    public void makesNoise1() {
        CropDuster cropDuster = new CropDuster();
        String actual = "trtrtrr";
        Assert.assertNotEquals(actual, cropDuster.makeNoise());
    }
    @Test
    public void fertilize() {
       CropRow cropRow=new CropRow();
        CropDuster cropDuster = new CropDuster();

        Assert.assertEquals(cropRow, cropDuster.fertilize(cropRow));
    }
    @Test
    public void fly(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof Flyable);
    }
    @Test
    public  void fertilizing(){
        CropDuster cropDuster = new CropDuster();
        cropDuster.flying();
        Assert.assertTrue(cropDuster.flying());
    }
    @Test
    public  void land(){
        CropDuster cropDuster = new CropDuster();
        cropDuster.flying();
        Assert.assertFalse(cropDuster.land());
    }

    @Test
    public void isPilot(){
        CropDuster cropDuster = new CropDuster();
        Froilanda froilanda=new Froilanda();
        Assert.assertTrue(cropDuster.isPilot(froilanda));
    }
    @Test
    public void isPilot1(){
        CropDuster cropDuster = new CropDuster();
        Froilan froilan=new Froilan();
        Assert.assertFalse(cropDuster.isPilot(froilan));
    }
}