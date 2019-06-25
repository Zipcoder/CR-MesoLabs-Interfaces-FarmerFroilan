//package com.zipcodewilmington.froilansfarm.Vehicles;
//
//import com.zipcodewilmington.froilansfarm.Animal.NoiseMaker;
//import com.zipcodewilmington.froilansfarm.Crops.Crops;
//import com.zipcodewilmington.froilansfarm.Crops.CucumberPlant;
//import com.zipcodewilmington.froilansfarm.Produce.Edible;
//import com.zipcodewilmington.froilansfarm.Vehicles.FarmVehicle;
//import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
//import org.junit.Assert;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//public class TractorTest {
//
//    @Test
//    public void instanceOf(){
//        Tractor tractor=new Tractor();
//        Assert.assertTrue(tractor instanceof FarmVehicle);
//    }
//
//    @Test
//    public void instanceOf1(){
//        Tractor tractor=new Tractor();
//        Assert.assertTrue(tractor instanceof NoiseMaker);
//    }
//
//@Test
//    public void makeNoise(){
//    Tractor tractor=new Tractor();
//    String expected="vroom";
//    Assert.assertNotEquals(expected, tractor.makeNoise());
//}
//
//    @Test
//    public void makeNoise1(){
//        Tractor tractor=new Tractor();
//        String expected="trtrtrrr";
//        Assert.assertEquals(expected, tractor.makeNoise());
//    }
//
//    @Test
//    public void harvest() {
//        Tractor tractor=new Tractor();
//        Crops crops=new CucumberPlant();
//        String actual=null;
//        Assert.assertEquals(null,tractor.harvest(crops));
//    }
//
//}