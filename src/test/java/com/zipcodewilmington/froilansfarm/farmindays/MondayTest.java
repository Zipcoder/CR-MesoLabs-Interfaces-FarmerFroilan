package com.zipcodewilmington.froilansfarm.farmindays;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.FarmBuilder;
import com.zipcodewilmington.froilansfarm.animals.Chicken;
import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.people.*;
import com.zipcodewilmington.froilansfarm.produce.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class MondayTest {

    private Farm farm;
    private FarmWorker workerFroiln;
    private FarmWorker workerFroilinda;
    private Monday monday = new Monday();

    @Before
    public void setUp() throws Exception {
        List<Person> farmWorkerList = new ArrayList<>();

        workerFroiln = new FarmWorker();
        workerFroilinda = new FarmWorker();

        Integer numberOfChickens = 15;
        Integer numberOfStables = 3;
        Integer numberOfFarmHouse = 1;
        Integer numberOfChickenCoops = 4;
        Integer numberOfHorses = 10;
        Integer numberOfCropDusters = 1;
        Integer numberOfTractors = 1;
        Integer numberOfCropRows = 5;
        Integer numberOfCornStalks = 50;
        Integer numberOfWheatStalks = 50;
        Integer numberOfTomatoPlants = 50;
        Integer numberOfPotatoPlants = 50;
        Integer numberOfCarrotPlants = 50;

        farm = new FarmBuilder().setNumberOfCarrotPlants(numberOfCarrotPlants)
                .setNumberOfChickenCoops(numberOfChickenCoops)
                .setNumberOfChickens(numberOfChickens)
                .setNumberOfCornStalks(numberOfCornStalks)
                .setNumberOfCropDusters(numberOfCropDusters)
                .setNumberOfCropRows(numberOfCropRows)
                .setNumberOfFarmHouse(numberOfFarmHouse)
                .setNumberOfHorses(numberOfHorses)
                .setNumberOfPotatoPlants(numberOfPotatoPlants)
                .setNumberOfTomatoPlants(numberOfTomatoPlants)
                .setNumberOfStables(numberOfStables)
                .setNumberOfTractors(numberOfTractors)
                .setNumberOfWheatStalks(numberOfWheatStalks)
                .build();
    }

    @Test
    public void testRideHorses() {
        //Given
        Person froilin = new RiderDecorator(workerFroiln);
        Person frolinda = new RiderDecorator(workerFroilinda);
        Boolean isRidden;

        List<Horse> horses = monday.getStableHorses(farm);

        //When
        monday.rideEachHorse(horses, froilin, frolinda);

        //Then
        isRidden = monday.checkEachHorseRidden(horses);

        Assert.assertTrue(isRidden);
    }

    @Test
    public void testFeedHorse() {
        //Given
        Person froilan = new FarmerDecorator(workerFroiln);
        Person froilinda = new FarmerDecorator(workerFroilinda);
        Boolean isHorseFed = false;

        List<CornStalk> cornStalks = farm.getCropRowList().get(0).getCrops();
        List<EarCorn> earCorns = monday.getEdibleCornStalks(farm, cornStalks);
        List<Horse> horses = monday.getStableHorses(farm);

        //When
        monday.feedEachHorse(horses, froilan, froilinda, earCorns);

        //Then
        isHorseFed = monday.checkEachHorseAte(horses);

        Assert.assertTrue(isHorseFed);

    }

    @Test
    public void testEatBreakFast() {
        //Given
        List<CornStalk> cornStalks = farm.getCropRowList().get(0).getCrops();
        List<TomatoPlant> tomatoPlants = farm.getCropRowList().get(1).getCrops();
        List<Chicken> chickens = new ArrayList<>();
        List<EarCorn> earCorns = new ArrayList<>();
        List<Tomato> tomatoes = new ArrayList<>();
        List<EdibleEgg> edibleEggs = new ArrayList<>();
        int froilanAteEggsCount = 0, froilanAteCornCount = 0, froilanAteTomatoesCount = 0,
                froilindaAteEggsCount = 0, froilindaAteCornCount = 0, froilindaAteTomatoesCount = 0;

        chickens = monday.getCoopChickens(farm);

        edibleEggs = monday.getSevenEggs(chickens);
        earCorns = monday.getThreeCorns(cornStalks);
        tomatoes = monday.getThreeTomatoes(tomatoPlants);

        //When
        froilanAteCornCount = monday.workerAteBF(workerFroiln, earCorns, 1);
        froilanAteTomatoesCount = monday.workerAteBF(workerFroiln, tomatoes, 2);
        froilanAteEggsCount = monday.workerAteBF(workerFroiln, edibleEggs, 5);

        froilindaAteCornCount =  monday.workerAteBF(workerFroiln,earCorns,2);
        froilindaAteTomatoesCount = monday.workerAteBF(workerFroiln,tomatoes,1);
        froilindaAteEggsCount =  monday.workerAteBF(workerFroiln,edibleEggs,2);

        //Then
        Assert.assertEquals(1, froilanAteCornCount);
        Assert.assertEquals(2, froilanAteTomatoesCount);
        Assert.assertEquals(5, froilanAteEggsCount);

        Assert.assertEquals(2, froilindaAteCornCount);
        Assert.assertEquals(1, froilindaAteTomatoesCount);
        Assert.assertEquals(2, froilindaAteEggsCount);
    }
}