package com.zipcodewilmington.froilansfarm.HousingTest;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Farm.Housing;
import com.zipcodewilmington.froilansfarm.Farm.Stable;
import org.junit.Assert;
import org.junit.Test;

public class StableTest {
    Horse horse = new Horse();

    @Test
    public void stableSizeOne() {
        //Given
        Stable stable = new Stable(83, horse);
        int expected = 83;

        //When
        int actual = stable.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stableSizeTwo() {
        //Given
        Stable stable = new Stable(8, horse);
        int expected = 8;

        //When
        int actual = stable.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void horseDiedOne() {
        //Given
        Stable stable = new Stable(8, horse);
        int expected = 7;

        //When
        stable.brokenLeg(horse);
        int actual = stable.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addHorse() {
        //Given
        Stable stable = new Stable(8, horse);
        int expected = 9;

        //When
        stable.store(horse);
        int actual = stable.size();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void inheritance() {
        //Given
        Stable stable = new Stable();

        //Then
        Assert.assertTrue(stable instanceof Housing);
    }
}
