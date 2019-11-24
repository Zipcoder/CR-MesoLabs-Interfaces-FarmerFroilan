package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.people.Froilan;
import com.zipcodewilmington.froilansfarm.people.Froilanda;
import org.junit.Assert;
import org.junit.Test;

public class DaysOfTheWeekTests {

    @Test
    public void SundayTest(){
        Froilan froilan = new Froilan("Froilan");
        Froilanda froilanda = new Froilanda("Froilanda");
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();

        froilan.mount(horse1);
        froilanda.mount(horse2);
        Assert.assertTrue(horse1.mounted());
        Assert.assertTrue(horse2.mounted());

        froilan.dismount(horse1);
        froilanda.dismount(horse2);
        Assert.assertFalse(horse1.dismounted());
        Assert.assertFalse(horse2.dismounted());


    }

    @Test
    public void MondayTest(){
        Froilan froilan = new Froilan("Froilan");
        Froilanda froilanda = new Froilanda("Froilanda");
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();

        froilan.mount(horse1);
        froilanda.mount(horse2);
        Assert.assertTrue(horse1.mounted());
        Assert.assertTrue(horse2.mounted());

        froilan.dismount(horse1);
        froilanda.dismount(horse2);
        Assert.assertFalse(horse1.dismounted());
        Assert.assertFalse(horse2.dismounted());

    }

    @Test
    public void TuesdayTest(){

    }

    @Test
    public void WednesdayTest(){

    }

    @Test
    public void ThursdayTest(){

    }

    @Test
    public void FridayTest(){

    }

    @Test
    public void SaturdayTest(){

    }
}
