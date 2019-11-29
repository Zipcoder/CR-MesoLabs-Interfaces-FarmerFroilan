package com.zipcodewilmington.froilansfarm.vehicle;
import com.zipcodewilmington.froilansfarm.farm.Farm;
import com.zipcodewilmington.froilansfarm.plants.Field;
import com.zipcodewilmington.froilansfarm.miscinterfaces.Rider;

public abstract class FarmVehicle extends Vehicle {
    Farm farm;
    Rider rider;

   abstract boolean operate(Field field);
}
