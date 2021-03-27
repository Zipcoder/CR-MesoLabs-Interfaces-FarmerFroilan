package com.zipcodewilmington.froilansfarm.PersonRelated;

import com.zipcodewilmington.froilansfarm.AnimalStorage.AnimalStorage;
import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.FieldRelated.Crop;
import com.zipcodewilmington.froilansfarm.FieldRelated.CropRow;
import com.zipcodewilmington.froilansfarm.Ridable;

import java.util.ArrayList;

public class Farmer extends Person implements Botanist, Rider {


    public void plants(Crop crop, CropRow cropRow,Integer numOfCrops) {
        for (int i = 0; i <numOfCrops ; i++) {
            cropRow.add(crop);
        }
    }

    public void mount(Ridable ridable) {
    }

    public void dismount(Ridable ridable) {
    }

    public void ride(Ridable ridable) {
        if (ridable instanceof Ridable) {
                System.out.print("ride horse");
        }

    }

    public void eat(Edible edible) {

    }

}
