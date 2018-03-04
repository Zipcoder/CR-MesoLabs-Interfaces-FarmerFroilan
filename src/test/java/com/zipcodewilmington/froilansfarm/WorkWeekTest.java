package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.farm.buildings.ChickenCoop;
import com.zipcodewilmington.froilansfarm.farm.buildings.FarmHouse;
import com.zipcodewilmington.froilansfarm.farm.buildings.Stable;
import com.zipcodewilmington.froilansfarm.farm.buildings.WareHouse;
import com.zipcodewilmington.froilansfarm.farm.field.CropRow;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals.Chicken;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals.Horse;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people.Farmer;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.people.Pilot;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.crops.*;
import com.zipcodewilmington.froilansfarm.farm.things.livingthings.edibles.EdibleType;
import com.zipcodewilmington.froilansfarm.farm.things.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.farm.things.vehicles.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WorkWeekTest {

    //Developer's Note//

    /*
    These tests are designed to be run in sequence so as to preserve the state of the farm from
    day to day. All except the first test will fail unless all tests are run together.
    */

    private static final Farm froilandia = new Farm();
    Farmer froilan;
    Pilot froilanda;
    CropDuster badLarry;
    Tractor badLenny;
    WareHouse wareHouse;
    Stable friendStable;
    Stable workStable;
    Stable eliteStable;
    Horse shadowfax;
    Horse americanPharoh;
    ChickenCoop coop1;
    ChickenCoop coop2;
    ChickenCoop coop3;
    ChickenCoop coop4;
    CropRow cornRow;
    CropRow tomatoRow;
    CropRow veggieRow1;
    CropRow veggieRow2;
    CropRow veggieRow3;
    FarmHouse farmHouse;


    //Just a bunch of setup for ease of reference later on
    @Before
    public void a_setUp() {
        froilan = (Farmer) froilandia.getFarmHouse().getPerson("Froilan");
        froilanda = (Pilot) froilandia.getFarmHouse().getPerson("Froilanda");
        badLarry = (CropDuster) froilandia.getVehicles().get(0);
        badLenny = (Tractor) froilandia.getVehicles().get(1);
        wareHouse = froilandia.getWareHouse();
        friendStable = froilandia.getStables().get(0);
        workStable = froilandia.getStables().get(1);
        eliteStable = froilandia.getStables().get(2);
        shadowfax = froilandia.getStables().get(2).getHorse("Shadowfax");
        americanPharoh = froilandia.getStables().get(2).getHorse("American Pharoh");
        coop1 = froilandia.getChickenCoops().get(0);
        coop2 = froilandia.getChickenCoops().get(1);
        coop3 = froilandia.getChickenCoops().get(2);
        coop4 = froilandia.getChickenCoops().get(3);
        cornRow = froilandia.getField().getRow(0);
        tomatoRow = froilandia.getField().getRow(1);
        veggieRow1 = froilandia.getField().getRow(2);
        veggieRow2 = froilandia.getField().getRow(3);
        veggieRow3 = froilandia.getField().getRow(4);
        farmHouse = froilandia.getFarmHouse();
    }

    @Test
    public void b_mondayMorning(){
        //When
        froilanEatsBreakfast();
        froilandaEatsBreakfast();
        froilanFeedsChickens();
        froilandaFeedsHorses();
        froilan.exerciseHorses(friendStable);
        froilanda.exerciseHorses(workStable);
        froilan.exerciseHorses(eliteStable);
        int expectedStorage = 512;
        int actualStorage = wareHouse.getStorageSize();

        //Then
        Assert.assertTrue(froilan.getEnergyReserves()==27);
        Assert.assertTrue(froilanda.getEnergyReserves()==16);

        Assert.assertEquals(expectedStorage,actualStorage);

        allChickensHaveBeenFed();
        allHorsesHaveBeenFed();
        allHorsesHaveBeenExercised();
    }

    @Test
    public void c_mondayAfternoon(){
        //When
        froilandaFertilzesARow(cornRow);
        froilanPlantsARow(CropType.ARBITRARYVEGETATION,veggieRow2);
        froilandaCollectsEggs();
        int expectedStorage = 527;
        int actualStorage = wareHouse.getStorageSize();

        //Then
        Assert.assertEquals(expectedStorage,actualStorage);

        allCropsAreFertilized(cornRow);

        Assert.assertTrue(veggieRow2.getCrop(0) instanceof ArbitrayVegetation);
        Assert.assertTrue(veggieRow2.getCrop(99) instanceof ArbitrayVegetation);
        Assert.assertFalse(veggieRow2.getCrop(50).isFertilized());
        Assert.assertFalse(veggieRow2.getCrop(22).isHarvested());

        //NightTime Comes to reset the booleans on the creatures...
        froilandia.nightFall();
    }

    @Test
    public void d_tuesdayMorning(){
        //When
        froilanEatsBreakfast();
        froilandaEatsBreakfast();
        froilanFeedsChickens();
        froilanFeedsHorses();
        froilanda.exerciseHorses(friendStable);
        froilanda.exerciseHorses(workStable);
        froilanda.exerciseHorses(eliteStable);
        froilanPlantsARow(CropType.ARBITRARYVEGETATION,veggieRow3);
        int expectedStorage = 489;
        int actualStorage = wareHouse.getStorageSize();

        //Then
        Assert.assertTrue(froilan.getEnergyReserves()==27);
        Assert.assertTrue(froilanda.getEnergyReserves()==16);

        Assert.assertEquals(expectedStorage,actualStorage);

        allChickensHaveBeenFed();
        allHorsesHaveBeenFed();
        allHorsesHaveBeenExercised();

        Assert.assertTrue(veggieRow3.getCrop(0) instanceof ArbitrayVegetation);
        Assert.assertTrue(veggieRow3.getCrop(99) instanceof ArbitrayVegetation);
        Assert.assertFalse(veggieRow3.getCrop(50).isFertilized());
        Assert.assertFalse(veggieRow3.getCrop(22).isHarvested());
    }

    @Test
    public void e_tuesdayAfternoon(){
        //When
        froilandaFertilzesARow(tomatoRow);
        froilanHarvestsARow(cornRow);
        froilandaCollectsEggs();
        int expectedStorage = 604;
        int actualStorage = wareHouse.getStorageSize();

        //Then
        Assert.assertEquals(expectedStorage,actualStorage);
        Assert.assertTrue(cornRow.getRowSize() == 0);
        allCropsAreFertilized(tomatoRow);

        //NightTime Comes to reset the booleans on the creatures...
        froilandia.nightFall();
    }

    @Test
    public void f_wednesdayMorning(){
        //When
        froilanEatsBreakfast();
        froilandaEatsBreakfast();
        froilandaFeedsChickens();
        froilanFeedsHorses();
        froilanda.exerciseHorses(friendStable);
        froilan.exerciseHorses(workStable);
        froilanCollectsEggs();
        int expectedStorage = 581;
        int actualStorage = wareHouse.getStorageSize();

        //Then
        Assert.assertTrue(froilan.getEnergyReserves()==27);
        Assert.assertTrue(froilanda.getEnergyReserves()==16);

        Assert.assertEquals(expectedStorage,actualStorage);

        allChickensHaveBeenFed();
        allHorsesHaveBeenFed();
    }

    @Test
    public void g_wednesdayAfternoon(){
        //When
        froilandaFertilzesARow(veggieRow1);
        froilanda.mount(shadowfax);
        shadowfax.goForRide();
        froilanda.dismount(shadowfax);
        froilanda.mount(americanPharoh);
        americanPharoh.goForRide();
        froilanda.dismount(americanPharoh);
        froilanPlantsARow(CropType.CORNSTALK, cornRow);
        int expectedStorage = 581;
        int actualStorage = wareHouse.getStorageSize();

        //Then
        Assert.assertEquals(expectedStorage,actualStorage);
        allHorsesHaveBeenExercised();
        allCropsAreFertilized(veggieRow1);


        Assert.assertTrue(cornRow.getCrop(0) instanceof CornStalk);
        Assert.assertTrue(cornRow.getCrop(99) instanceof CornStalk);
        Assert.assertFalse(cornRow.getCrop(50).isFertilized());
        Assert.assertFalse(cornRow.getCrop(22).isHarvested());

        //NightTime Comes to reset the booleans on the creatures...
        froilandia.nightFall();
    }

    @Test
    public void h_thursdayMorning(){
        //When
        froilanEatsBreakfast();
        froilandaEatsBreakfast();
        froilanFeedsChickens();
        froilandaFeedsHorses();
        froilandaCollectsEggs();
        froilan.exerciseHorses(friendStable);
        froilan.exerciseHorses(workStable);
        froilan.exerciseHorses(eliteStable);
        int expectedStorage = 558;
        int actualStorage = wareHouse.getStorageSize();

        //Then
        Assert.assertTrue(froilan.getEnergyReserves()==27);
        Assert.assertTrue(froilanda.getEnergyReserves()==16);

        Assert.assertEquals(expectedStorage,actualStorage);

        allChickensHaveBeenFed();
        allHorsesHaveBeenFed();
        allHorsesHaveBeenExercised();
    }

    @Test
    public void j_thursdayAfternoon(){
        //When
        froilandaFertilzesARow(veggieRow2);
        froilanHarvestsARow(veggieRow1);
        int expectedStorage = 658;
        int actualStorage = wareHouse.getStorageSize();

        //Then
        Assert.assertEquals(expectedStorage,actualStorage);
        Assert.assertTrue(veggieRow1.getRowSize() == 0);
        allCropsAreFertilized(veggieRow2);

        //NightTime Comes to reset the booleans on the creatures...
        froilandia.nightFall();
    }

    @Test
    public void k_fridayMorning(){
        //When
        froilanEatsBreakfast();
        froilandaEatsBreakfast();
        froilandaFeedsChickens();
        froilandaFeedsHorses();
        froilan.exerciseHorses(friendStable);
        froilan.exerciseHorses(workStable);
        froilan.exerciseHorses(eliteStable);
        int expectedStorage = 620;
        int actualStorage = wareHouse.getStorageSize();


        //Then
        Assert.assertTrue(froilan.getEnergyReserves()==27);
        Assert.assertTrue(froilanda.getEnergyReserves()==16);

        Assert.assertEquals(expectedStorage,actualStorage);

        allChickensHaveBeenFed();
        allHorsesHaveBeenFed();
        allHorsesHaveBeenExercised();
    }

    @Test
    public void l_fridayAfternoon(){
        //When
        froilandaFertilzesARow(veggieRow3);
        froilandaCollectsEggs();
        froilanHarvestsARow(tomatoRow);
        int expectedStorage = 735;
        int actualStorage = wareHouse.getStorageSize();

        //Then
        Assert.assertEquals(expectedStorage,actualStorage);
        allCropsAreFertilized(veggieRow3);
        Assert.assertTrue(tomatoRow.getRowSize()==0);

        //NightTime Comes to reset the booleans on the creatures...
        froilandia.nightFall();

    }

    @Test
    public void m_saturdayMorning(){
        //When
        froilanEatsBreakfast();
        froilandaEatsBreakfast();
        froilandaFeedsChickens();
        froilandaFeedsHorses();
        froilan.exerciseHorses(friendStable);
        froilan.exerciseHorses(workStable);
        froilan.exerciseHorses(eliteStable);
        int expectedStorage = 697;
        int actualStorage = wareHouse.getStorageSize();

        //Then
        Assert.assertTrue(froilan.getEnergyReserves()==27);
        Assert.assertTrue(froilanda.getEnergyReserves()==16);

        Assert.assertEquals(expectedStorage,actualStorage);

        allChickensHaveBeenFed();
        allHorsesHaveBeenFed();
        allHorsesHaveBeenExercised();

    }

    @Test
    public void n_saturdayAfternoon(){
        //When
        froilanda.mount(badLarry);
        String actualPlaneNoise = badLarry.makeNoise();
        badLarry.shutDown(froilandia);
        badLarry.operate(froilandia);
        froilanda.dismount(badLarry);
        froilan.mount(badLenny);
        String actualTractorNoise = badLenny.makeNoise();
        badLenny.shutDown(froilandia);
        badLenny.operate(froilandia);
        froilan.dismount(badLenny);
        coop1.removeChicken(coop1.getChicken("Steve"));
        coop2.addChicken(new Chicken("Steve"));
        workStable.removeHorse(workStable.getHorse("Vince"));
        workStable.removeHorse(workStable.getHorse(2));
        eliteStable.removeHorse(americanPharoh);
        workStable.addHorse(new Horse("A Horse With No Name"));
        Horse[] expectedHorses = {shadowfax};
        Horse[] actualHorses = eliteStable.getAllHorses().toArray(new Horse[0]);
        String expectedTractorNoise = "baRUMPBUMPbumpbumpBUMPBUMP!!!";
        String expectedPlaneNoise = "mmmmmmmrrrrRRRRRROOOOOOOWWWWWWwwwwwww!!!";

        //Then
        Assert.assertArrayEquals(expectedHorses,actualHorses);
        Assert.assertEquals(expectedPlaneNoise,actualPlaneNoise);
        Assert.assertEquals(expectedTractorNoise,actualTractorNoise);
        Assert.assertTrue(workStable.getStableSize() == 3);
        Assert.assertTrue(coop1.getChickenCoopSize() == 4);
        Assert.assertTrue(coop2.getChickenCoopSize() == 4);

        //NightTime Comes to reset the booleans on the creatures...
        froilandia.nightFall();
    }

    @Test
    public void o_sundayMorning(){
        //When
        froilanEatsBreakfast();
        froilandaEatsBreakfast();
        froilandaFeedsChickens();
        froilandaFeedsHorses();
        froilan.exerciseHorses(friendStable);
        froilan.exerciseHorses(workStable);
        froilan.exerciseHorses(eliteStable);
        froilandaCollectsEggs();
        int expectedStorage = 676;
        int actualStorage = wareHouse.getStorageSize();

        //Then
        Assert.assertTrue(froilan.getEnergyReserves()==27);
        Assert.assertTrue(froilanda.getEnergyReserves()==16);

        Assert.assertEquals(expectedStorage,actualStorage);

        allChickensHaveBeenFed();
        allHorsesHaveBeenFed();
        allHorsesHaveBeenExercised();

    }

    @Test
    public void p_sundayNight(){
        //When
        String actualFarmerNoise = froilan.makeNoise();
        String actualPilotNoise = froilanda.makeNoise();
        String actualChickenNoise = coop1.getChicken(0).makeNoise();
        String actualHorseNoise = shadowfax.makeNoise();
        String expectedFarmerNoise = "E I E I O";
        String expectedPilotNoise = "Talk to me Goose";
        String expectedChickenNoise = "bucKAW!!!";
        String expectedHorseNoise = "neeeeEEEEIIIIIIGGGGGGGhhhhhhh!!!";

        //Then
        Assert.assertEquals(expectedChickenNoise,actualChickenNoise);
        Assert.assertEquals(expectedFarmerNoise,actualFarmerNoise);
        Assert.assertEquals(expectedHorseNoise,actualHorseNoise);
        Assert.assertEquals(expectedPilotNoise,actualPilotNoise);

    }



    //Just some methods to help clean up the readability of the tests
    public void froilanEatsBreakfast(){
        froilan.eat(EdibleType.EGG,wareHouse);
        froilan.eat(EdibleType.EGG,wareHouse);
        froilan.eat(EdibleType.EGG,wareHouse);
        froilan.eat(EdibleType.EGG,wareHouse);
        froilan.eat(EdibleType.EGG,wareHouse);
        froilan.eat(EdibleType.TOMATO,wareHouse);
        froilan.eat(EdibleType.TOMATO,wareHouse);
        froilan.eat(EdibleType.EARCORN,wareHouse);
    }

    public void froilandaEatsBreakfast(){
        froilanda.eat(EdibleType.EARCORN,wareHouse);
        froilanda.eat(EdibleType.EARCORN,wareHouse);
        froilanda.eat(EdibleType.TOMATO,wareHouse);
        froilanda.eat(EdibleType.EGG,wareHouse);
        froilanda.eat(EdibleType.EGG,wareHouse);
    }

    public void froilanFeedsHorses(){
        froilan.feedHorses(friendStable,wareHouse);
        froilan.feedHorses(workStable,wareHouse);
        froilan.feedHorses(eliteStable,wareHouse);
    }
    public void froilandaFeedsHorses(){
        froilanda.feedHorses(friendStable,wareHouse);
        froilanda.feedHorses(workStable,wareHouse);
        froilanda.feedHorses(eliteStable,wareHouse);
    }

    public void froilanFeedsChickens(){
        froilan.feedChickens(coop1,wareHouse);
        froilan.feedChickens(coop2,wareHouse);
        froilan.feedChickens(coop3,wareHouse);
        froilan.feedChickens(coop4,wareHouse);
    }

    public void froilandaFeedsChickens(){
        froilanda.feedChickens(coop1,wareHouse);
        froilanda.feedChickens(coop2,wareHouse);
        froilanda.feedChickens(coop3,wareHouse);
        froilanda.feedChickens(coop4,wareHouse);
    }

    public void allChickensHaveBeenFed(){
        for (Chicken c : coop1.getAllChickens()) Assert.assertTrue(c.hasBeenFed());
        for (Chicken c : coop2.getAllChickens()) Assert.assertTrue(c.hasBeenFed());
        for (Chicken c : coop3.getAllChickens()) Assert.assertTrue(c.hasBeenFed());
        for (Chicken c : coop4.getAllChickens()) Assert.assertTrue(c.hasBeenFed());
    }

    public void allHorsesHaveBeenFed(){
        for (Horse h : friendStable.getAllHorses()) Assert.assertTrue(h.hasBeenFed());
        for (Horse h : workStable.getAllHorses()) Assert.assertTrue(h.hasBeenFed());
        for (Horse h : eliteStable.getAllHorses()) Assert.assertTrue(h.hasBeenFed());
    }

    public void allHorsesHaveBeenExercised(){
        for (Horse h : friendStable.getAllHorses()) Assert.assertTrue(h.wasExercised());
        for (Horse h : workStable.getAllHorses()) Assert.assertTrue(h.wasExercised());
        for (Horse h : eliteStable.getAllHorses()) Assert.assertTrue(h.wasExercised());
    }

    public void froilandaFertilzesARow(CropRow targetRow){
        froilanda.mount(badLarry);
        froilanda.flyAircraft(badLarry);
        badLarry.fertilize(targetRow);
        froilanda.landAircraft(badLarry);
        froilanda.dismount(badLarry);
    }

    public void froilanPlantsARow(CropType typeToPlant, CropRow targetRow){
        for(int i = 0; i< 100; i++){
            froilan.plant(CropFactory.createCrop(typeToPlant), targetRow);
        }
    }

    public void froilandaCollectsEggs(){
        froilanda.collectEggs(coop1,wareHouse);
        froilanda.collectEggs(coop2,wareHouse);
        froilanda.collectEggs(coop3,wareHouse);
        froilanda.collectEggs(coop4,wareHouse);
    }

    public void froilanCollectsEggs(){
        froilan.collectEggs(coop1,wareHouse);
        froilan.collectEggs(coop2,wareHouse);
        froilan.collectEggs(coop3,wareHouse);
        froilan.collectEggs(coop4,wareHouse);
    }

    public void allCropsAreFertilized(CropRow targetRow){
        for(Crop c : targetRow.getAllCrops()){
            Assert.assertTrue(c.isFertilized());
        }
    }

    public void froilanHarvestsARow(CropRow targetRow){
        froilan.mount(badLenny);
        badLenny.harvestCrop(targetRow, wareHouse);
        froilan.dismount(badLenny);
    }



}
