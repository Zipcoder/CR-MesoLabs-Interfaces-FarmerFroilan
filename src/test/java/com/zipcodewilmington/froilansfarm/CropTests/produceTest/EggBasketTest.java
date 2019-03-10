package com.zipcodewilmington.froilansfarm.CropTests.produceTest;

import com.zipcodewilmington.froilansfarm.animals.farmAnimal.Chicken;
import com.zipcodewilmington.froilansfarm.producers.produce.Egg;
import com.zipcodewilmington.froilansfarm.storage.ChickenCoops;
import com.zipcodewilmington.froilansfarm.storage.EggBasket;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EggBasketTest {
    EggBasket eggBasket = new EggBasket();
    Egg edibleEgg = new Egg();
    Chicken chicken = new Chicken();
    Chicken[] chickens = {chicken, chicken, chicken, chicken,chicken};
    List<Chicken> fertilizedChickens = ChickenCoops.checkChickenFertilization(Arrays.asList(chickens));
    List<Egg> edibleEggs = ChickenCoops.collectEdibleEggs(fertilizedChickens);





        @Test
        public void addTest() {
            //Given
            eggBasket.add(edibleEgg);
            Boolean expected = false;
            //When
            Boolean actual = eggBasket.isEmpty(eggBasket);
            //Then
            Assert.assertEquals(expected,actual);

        }

        @Test
        public void removeTest(){
            //Given
            eggBasket.add(edibleEgg);
            eggBasket.add(edibleEgg);
            Integer expected = 1;

            //When
            eggBasket.removeEgg(edibleEgg);
            Integer actual = eggBasket.getNumberOfEggs();

            //Then
            Assert.assertEquals(expected,actual);
        }

        @Test
        public void emptyBasket(){
            //Given
            eggBasket.addEdibleEggsFromCoop(edibleEggs);
            Integer expected = 0;

            //When
            eggBasket.removeAllEggs();

            Integer actual = eggBasket.getNumberOfEggs();

            //Then
            Assert.assertEquals(expected,actual);
        }



}
