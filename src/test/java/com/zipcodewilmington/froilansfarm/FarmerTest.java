package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FarmerTest {

    @Test
    public void testMakeNoise(){
        Farmer testFarmer = new Farmer();
        String expected = "Ey aye ey aye oh";

        Assert.assertEquals(expected, testFarmer.makeNoise());
    }

    @Test
    public void testEat(){
        //Given
        Farmer testFarmer = new Farmer();
        Tomato edibleTomato = new Tomato();
        //When
        testFarmer.eat(edibleTomato);
        List fakeStomach = new ArrayList<Edible>();

        fakeStomach.add(edibleTomato);
        //Then
        Assert.assertEquals(fakeStomach, testFarmer.getStomachContents());
    }

    @Test
    public void testMount(){
        //Given
        Farmer testFarmer = new Farmer();
        Horse testHorse = new Horse();
        //When
        testFarmer.mount(testHorse);
        //Then
        Assert.assertTrue(testHorse.getRideStatus());
    }

    @Test
    public void testUnmount(){
        //Given
        Farmer testFarmer = new Farmer();
        Horse testHorse = new Horse();

        //When
        testFarmer.unmount(testHorse);

        //Then
        Assert.assertFalse(testHorse.getRideStatus());
    }

    @Test
    public void testPlant(){
        //Given
        Farmer testFarmer = new Farmer();
        CornStalk cs = new CornStalk();
        CropRow cropRow = new CropRow();
        List fakeCropRow = new ArrayList<Crop>();
        fakeCropRow.add(cs);

        //When
        testFarmer.plant(cs, cropRow);

        //Then
        Assert.assertEquals(fakeCropRow, cropRow.getList());
    }

    @Test
    public void testDoChores(){
        //Given
        Farmer froilan = new Farmer();

        //When
        froilan.doMorningChores(froilan.getFarm());
        ArrayList<Horse> horses = froilan.getFarm().getHorses();
        int lastIndexOfHorses = horses.size()-1;

        //Then
        Assert.assertTrue(horses.get(lastIndexOfHorses).getRideStatus());
    }
    @Test
    public void testsundayChoreCropRow1(){
        //Given
        Farmer froilan = new Farmer();

        //When
        froilan.sundayChore();
        CropRow cropRow = froilan.getFarm().getField().getList().get(0);

        //Then
        Assert.assertEquals(2,cropRow.size());
    }
    @Test
    public void testsundayChoreCropRow2(){
        //Given
        Farmer froilan = new Farmer();

        //When
        froilan.sundayChore();
        CropRow cropRow = froilan.getFarm().getField().getList().get(1);

        //Then
        Assert.assertEquals(2,cropRow.size());
    }
    @Test
    public void testsundayChoreCropRow3(){
        //Given
        Farmer froilan = new Farmer();

        //When
        froilan.sundayChore();
        CropRow cropRow = froilan.getFarm().getField().getList().get(2);

        //Then
        Assert.assertEquals(2,cropRow.size());
    }
    @Test
    public void testFly(){
        //Given
        Pilot pilot = new Pilot();
        Farm farm=  new Farm();

        //When
        pilot.mondayChores(farm);
        boolean actualResult = farm.getField().getFlyOverTheField();

        //Then
        Assert.assertEquals(true,actualResult);

    }
    @Test
    public void testFertilizedFirstRow(){
        //Given
        Pilot pilot = new Pilot();
        Farm farm=  new Farm();

        //When
        pilot.mondayChores(farm);
        CropRow cropRow = farm.getField().getList().get(0);
        boolean actualResult = cropRow.getHasFertilized();

        //Then
        Assert.assertEquals(true,actualResult);

    }
    @Test
    public void testFertilizedLastRow(){
        //Given
        Pilot pilot = new Pilot();
        Farm farm=  new Farm();

        //When
        pilot.mondayChores(farm);
        CropRow cropRow = farm.getField().getList().get(4);
        boolean actualResult = cropRow.getHasFertilized();

        //Then
        Assert.assertEquals(true,actualResult);

    }
    @Test
    public void testTuesdayChores(){
        //Given
        Farmer froilan=  new Farmer();
       // int beforeResult = froilan.getFarm().getField().size();

        //When
        froilan.tuesdayChores();
       // int actualResult = froilan.getFarm().getField().size();
        List<CropRow> cropRowList = froilan.getFarm().getField().getList();
        CropRow cropRow = cropRowList.get(0);
        int actualResult = cropRow.size();

        //Then
        //Assert.assertEquals(5,beforeResult);
        Assert.assertEquals(0,actualResult);
    }
}
