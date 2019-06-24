package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Vehicles.Flyable;

public interface Pilot extends Person {

        public void flyAirCraft(Flyable airCraft);
        public void ceaseFlying(Flyable airCraft);
}
