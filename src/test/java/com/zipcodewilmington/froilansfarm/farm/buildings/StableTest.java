package com.zipcodewilmington.froilansfarm.farm.buildings;

import com.zipcodewilmington.froilansfarm.farm.things.livingthings.creatures.animals.Horse;
import org.junit.Assert;
import org.junit.Test;

public class StableTest {

    @Test
    public void addHorseTest(){
        //Given
        Stable test = new Stable();
        Horse larry = new Horse("Larry");

        //When
        test.addHorse(larry);
        Horse expected = larry;
        Horse actual = test.getHorse(larry);

        //Then
        Assert.assertEquals(expected,actual);


    }

    @Test
    public void removeHorseTest(){
        //Given
        Horse larry = new Horse("Larry");
        Horse lenny = new Horse ("Lenny");
        Stable test = new Stable(larry, lenny);

        //When
        test.removeHorse(lenny);
        int expected = 1;
        int actual = test.getStableSize();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getHorseTest(){
        //Given
        Horse larry = new Horse("Larry");
        Stable test = new Stable(larry);

        //When
        Horse expected = larry;
        Horse actual = test.getHorse(larry);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getHorseByIndexTest(){
        //Given
        Stable test = new Stable(new Horse("Larry"));

        //When
        String expected = "Larry";
        String actual = test.getHorse(0).getName();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getHorseByNameTest(){
        //Given
        Stable test = new Stable(new Horse("Larry"));

        //When
        String expected = "Larry";
        String actual = test.getHorse("Larry").getName();

        //Then
        Assert.assertEquals(expected,actual);
    }


}



