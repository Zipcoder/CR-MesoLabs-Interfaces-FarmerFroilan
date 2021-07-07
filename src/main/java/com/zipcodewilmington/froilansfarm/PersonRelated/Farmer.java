package com.zipcodewilmington.froilansfarm.PersonRelated;

import com.zipcodewilmington.froilansfarm.AnimalStorage.AnimalStorage;
import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.FieldRelated.Crop;
import com.zipcodewilmington.froilansfarm.FieldRelated.CropRow;
import com.zipcodewilmington.froilansfarm.Horse;
import com.zipcodewilmington.froilansfarm.Ridable;
import com.zipcodewilmington.froilansfarm.VehicleRelated.Tractor;

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
            if(ridable.getClass().equals(Horse.class)) {
                System.out.print(" ride horse ");
            }
            if(ridable.getClass().equals(Tractor.class)) {
                System.out.println("TRRRRRRRaaaaacttor in action!");
            }

        }

    }

    public void eat(Edible edible) {

    }

}
