package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animals.Horse;
import com.zipcodewilmington.froilansfarm.crops.TomatoPlants;
import com.zipcodewilmington.froilansfarm.mainFarm.Field;
import com.zipcodewilmington.froilansfarm.people.Froilan;
import com.zipcodewilmington.froilansfarm.people.Froilanda;
import com.zipcodewilmington.froilansfarm.vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.vehicles.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DaysOfTheWeekTests {

    Froilan froilan = new Froilan("Froilan");
    Froilanda froilanda = new Froilanda("Froilanda");
    Horse horse1 = new Horse();
    Horse horse2 = new Horse();
    CropDuster cropDuster = new CropDuster();
    Field field = new Field();
    Tractor tractor = new Tractor();
    TomatoPlants tomatoes;

    @Before
    public void setUpFarm() {
    }



    @Test
    public void SundayTest(){
        froilan.mount(horse1);
        froilanda.mount(horse2);
        Assert.assertTrue(horse1.mounted());
        Assert.assertTrue(horse2.mounted());

        froilan.dismount(horse1);
        froilanda.dismount(horse2);
        Assert.assertFalse(horse1.dismounted());
        Assert.assertFalse(horse2.dismounted());

        froilan.plant(tomatoes);
    }

    @Test
    public void MondayTest(){
        froilan.mount(horse1);
        froilanda.mount(horse2);
        Assert.assertTrue(horse1.mounted());
        Assert.assertTrue(horse2.mounted());

        froilan.dismount(horse1);
        froilanda.dismount(horse2);
        Assert.assertFalse(horse1.dismounted());
        Assert.assertFalse(horse2.dismounted());

        froilanda.mount(cropDuster);
        cropDuster.fly(field);

    }

    @Test
    public void TuesdayTest(){
        froilan.mount(horse1);
        froilanda.mount(horse2);
        Assert.assertTrue(horse1.mounted());
        Assert.assertTrue(horse2.mounted());

        froilan.dismount(horse1);
        froilanda.dismount(horse2);
        Assert.assertFalse(horse1.dismounted());
        Assert.assertFalse(horse2.dismounted());

        froilan.mount(tractor);
        tractor.harvest();

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
