package com.zipcodewilmington.froilansfarm.Person;

import com.zipcodewilmington.froilansfarm.Buildings.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Buildings.Stable;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.CropRow;
import com.zipcodewilmington.froilansfarm.FarmAnimal.Animal;
import com.zipcodewilmington.froilansfarm.FarmAnimal.Chicken;
import com.zipcodewilmington.froilansfarm.FarmAnimal.Horse;
import com.zipcodewilmington.froilansfarm.Interfaces.*;

public class Farmer extends Person implements Eater, Rider, Botanist {

    @Override
    public void plant(Crop crop, CropRow cropRow) {
        cropRow.addCrops(crop);
    }

    @Override
    public void mount(Rideable object) {
        if(!object.getMountedStatus()) {
            object.mount();
        }
    }

    @Override
    public void dismount(Rideable object) {
        if(object.getMountedStatus()) {
            object.dismount();
        }
    }

    public void fillCropRow(CropRow cropRow, Crop crop) {
        for(int i = 0; i < 30; i++) {
            plant(crop, cropRow);
        }

    }

    @Override
    public String makeNoise() {
        return "I'm a farmer...";
    }

    public void feedAnimals(Animal animal, Edible edible) {
        animal.eat(edible);
    }

    public void feedAllChickenInCoop(ChickenCoop coop, Edible edible) {
        for(Chicken chicken : coop.getChickens()) {
            feedAnimals(chicken, edible);
        }
    }

    public void feedAllHorsesInStable(Stable stable, Edible edible){
        for(Horse horse : stable.getHorses()) {
            feedAnimals(horse, edible);
        }
    }
}
