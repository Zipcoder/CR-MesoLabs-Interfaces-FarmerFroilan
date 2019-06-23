package com.zipcodewilmington.froilansfarm.Animal;

import com.zipcodewilmington.froilansfarm.Produce.Edible;
import com.zipcodewilmington.froilansfarm.Vehicles.Rideable;

public interface Person extends Animal {

        public void feedFarmAnimals(Eater animal, Edible food);
}

