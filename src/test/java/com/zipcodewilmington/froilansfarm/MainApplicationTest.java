package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.animal.Chicken;
import com.zipcodewilmington.froilansfarm.animal.Horse;
import com.zipcodewilmington.froilansfarm.food.Corn;
import com.zipcodewilmington.froilansfarm.food.Egg;
import com.zipcodewilmington.froilansfarm.food.Tomato;
import com.zipcodewilmington.froilansfarm.person.Farmer;
import com.zipcodewilmington.froilansfarm.plants.CornPlant;
import com.zipcodewilmington.froilansfarm.plants.CropRow;
import com.zipcodewilmington.froilansfarm.plants.Field;
import com.zipcodewilmington.froilansfarm.plants.TomatoPlant;
import com.zipcodewilmington.froilansfarm.vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Animal.AnimalHouse;
import com.zipcodewilmington.froilansfarm.vehicle.FarmVehicle;
import com.zipcodewilmington.froilansfarm.vehicle.Tractor;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 2/26/18.
 */

public class MainApplicationTest {
    //Instantiation
    // com.zipcodewilmington.froilansfarm.farm.Farm farm = new com.zipcodewilmington.froilansfarm.farm.Farm();
    Field field = new Field();
    CropRow cornRow = new CropRow();
    CropRow tomatoRow = new CropRow();
    CropRow cornRow1 = new CropRow();
    CropRow cornRow2 = new CropRow();
    CropRow tomatoRow1 = new CropRow();
    CornPlant cornPlant = new CornPlant();
    TomatoPlant tomatoPlant = new TomatoPlant();
    Farmer froilan = new Farmer("Froilan");
    Farmer froilanda = new Farmer("Froilanda");
    Corn corn = new Corn();
    Egg egg = new Egg();
    Tomato tomato = new Tomato();


    //4 chicken Coops with 15 chickens spread out
    AnimalHouse<Chicken> chickenCoop0 = new AnimalHouse<Chicken>();
    AnimalHouse<Chicken> chickenCoop1 = new AnimalHouse<Chicken>();
    AnimalHouse<Chicken> chickenCoop2 = new AnimalHouse<Chicken>();
    AnimalHouse<Chicken> chickenCoop3 = new AnimalHouse<Chicken>();

    //3 stables with 10 Horses spread out
    AnimalHouse<Horse> stable0 = new AnimalHouse<>();
    AnimalHouse<Horse> stable1 = new AnimalHouse<>();
    AnimalHouse<Horse> stable2 = new AnimalHouse<>();


    @Before
    public void setup() {


        for (int d = 0; d <= 2; d++){
            chickenCoop0.add(new Chicken());
            chickenCoop1.add(new Chicken());
            chickenCoop2.add(new Chicken());
            chickenCoop3.add(new Chicken());

        }
        chickenCoop0.add(new Chicken());
        chickenCoop0.add(new Chicken());
        chickenCoop0.add(new Chicken());



        for (int s = 0; s < 2; s++){
            stable0.add(new Horse());
            stable1.add(new Horse());
            stable2.add(new Horse());
        }
        stable0.add(new Horse());

        //2 farm Vehicles and an aircraft
        FarmVehicle tractor1 = new Tractor();
        FarmVehicle tractor2 = new Tractor();
        FarmVehicle cropDuster = new CropDuster();



/*
waiting for the plants to be functional
        //adding the plants to the cropRows
        tomatoRow.crops.add(tomatoPlant);
        cornRow.crops.add(cornPlant);
        tomatoRow1.crops.add(tomatoPlant);
        cornRow1.crops.add(cornPlant);
        cornRow2.crops.add(cornPlant);

        //adding the cropRows to the field
        field.rows.add(cornRow);
        field.rows.add(tomatoRow);
        field.rows.add(cornRow1);
        field.rows.add(tomatoRow1);
        field.rows.add(cornRow2);

*/



    }

    @Test
    public void SundayRideTest() {
        //Every morning, Froilan and Froilanda begin their morning by
/*
        //Riding each Horse in each Stable
        for (int i = 0; i < stable0.size(); i++) {
            froilan.mount(stable0.get(i)).ride(stable0.get(i).dismount());
            froilanda.mount(stable1.get(i)).ride(stable1.get(i).dismount());
            froilan.mount(stable2.get(i)).ride(stable2.get(i).dismount());

        }
        //Checking if horse was ridden
        for (int i = 0; i < stable0.size(); i++) {
            Assert.assertEquals(stable0.get(i).wasRidden == true);
            Assert.assertEquals(stable1.get(i).wasRidden == true);
            Assert.assertEquals(stable2.get(i).wasRidden == true);

        }
*/
    }
    @Test
    public void SundayEatTest() {
/*
        //Feeding each Horse in each Stable
        for (int i = 0; i < stable1.size(); i++) {
            stable0.get(i).eat(new Corn());
            stable1.get(i).eat(new Corn());
            stable2.get(i).eat(new Corn());


        }
        for (int i = 0; i < stable0.size(); i++) {
            Assert.assertEquals(stable0.get(i). == true);
            Assert.assertEquals(stable1.get(i).wasRidden == true);
            Assert.assertEquals(stable2.get(i).wasRidden == true);

        }

    }
*/
}
}

