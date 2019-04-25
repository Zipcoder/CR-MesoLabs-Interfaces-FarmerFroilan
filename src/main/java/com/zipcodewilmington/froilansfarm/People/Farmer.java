package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Buildings.Stable;
import com.zipcodewilmington.froilansfarm.Interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.People.Person;
import com.zipcodewilmington.froilansfarm.Plants.Crop;
import com.zipcodewilmington.froilansfarm.Plants.CropRow;
import com.zipcodewilmington.froilansfarm.Plants.EarCorn;

public class Farmer extends Person implements Botanist {

    public Farmer(String name) {
        super(name);
    }

    public void plant(Crop cropToPlant, CropRow rowToPlantIn) {
        rowToPlantIn
                .getCropArrayList()
                .add(cropToPlant);
    }

    public String fertilizeOnVehicle(Crop cropToBeFertilized) {
        if (isCurrentlyRidingSomething()) {
            cropToBeFertilized.fertilize();
            return "Crop fertilized!";
        } else {
            return "Dude where's my tractor?";
        }
    }

    @Override
    public String makeNoise() {
        return "Howdy";
    }

    public void eat(Edible food) {
        for (int i = 0; i < getFoodInventory().size(); i++) {
            if (getFoodInventory().get(i).equals(food)) {
                getFoodInventory().remove(i);
            }
        }
    }

    public void feed(Eater animalToBeFed, Edible food) {
        for (int i = 0; i < getFoodInventory().size(); i++) {
            if (getFoodInventory().get(i).equals(food)) {
                animalToBeFed.eat(getFoodInventory().remove(i));
            }
        }
    }

    public void feedAllHorses(Stable stable) {
        for (int i = 0; i < stable.getHorses().size(); i++) {
            feed(stable.getHorses().get(i), new EarCorn());
        }
    }

}
