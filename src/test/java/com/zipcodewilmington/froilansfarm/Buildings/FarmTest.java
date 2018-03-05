package com.zipcodewilmington.froilansfarm.Buildings;

import com.zipcodewilmington.froilansfarm.Crops.*;
import com.zipcodewilmington.froilansfarm.FarmAnimal.Chicken;
import com.zipcodewilmington.froilansfarm.FarmAnimal.Horse;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Person.Farmer;
import com.zipcodewilmington.froilansfarm.Person.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicles.Aircraft;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.Before;
import org.junit.Test;
import java.util.List;


public class FarmTest{

     Farm farm;
     Farmer froilan;
     Pilot froilanda;
     Field field;
     List<ChickenCoop> chickenCoops;
     List<Stable> stables;
     FarmVehicle tractor;
     Aircraft cropDuster;

    @Before
    public void setup() {
        farm = new Farm();
        froilan = farm.getFroilan();
        froilanda = farm.getFroilanda();
        field = farm.getField();
        chickenCoops = farm.getChickenCoops();
        stables = farm.getStables();
        tractor = farm.getTractor();
        cropDuster = farm.getCropDuster();

    }

    @Test
    public void mondayTest() {
        for(Stable stable : stables) {
            froilan.rideAllHorses(stable);
        }
    }
}