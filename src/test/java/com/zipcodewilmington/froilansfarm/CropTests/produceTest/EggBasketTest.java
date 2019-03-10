package com.zipcodewilmington.froilansfarm.CropTests.produceTest;

import com.zipcodewilmington.froilansfarm.producers.produce.Egg;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class EggBasketTest {
    ArrayList<Egg> eggBasket = new ArrayList<Egg>();
    Egg edibleEgg = new Egg();
    Egg[] bunchOfEggs = {edibleEgg, edibleEgg, edibleEgg, edibleEgg, edibleEgg};





        @Test
        public void addTest() {
            //Given
            eggBasket.add(edibleEgg);
            Boolean expected = false;
            //When
            Boolean actual = eggBasket.isEmpty();
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
            eggBasket.remove(edibleEgg);
            Integer actual = eggBasket.size();

            //Then
            Assert.assertEquals(expected,actual);
        }

        @Test
        public void emptyBasket(){
            //Given
            eggBasket.addAll(Arrays.asList(bunchOfEggs));
            Integer expected = 0;

            //When
            eggBasket.clear();
            Integer actual = eggBasket.size();

            //Then
            Assert.assertEquals(expected,actual);
        }



}
