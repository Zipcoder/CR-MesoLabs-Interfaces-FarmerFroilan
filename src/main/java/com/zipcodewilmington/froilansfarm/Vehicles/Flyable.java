package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Animal.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Animal.Pilot;
import com.zipcodewilmington.froilansfarm.Animal.Rider;

public interface Flyable extends Vehicle {

   public void fly();
   public boolean land();
   public boolean isPilot(Rider rider);
}
